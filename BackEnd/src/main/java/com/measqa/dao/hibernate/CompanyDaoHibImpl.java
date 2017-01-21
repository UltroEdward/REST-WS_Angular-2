package com.measqa.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.measqa.dao.interfaces.CompanyDao;
import com.measqa.entity.Company;
import com.measqa.utils.HibernateUtil;

public class CompanyDaoHibImpl implements CompanyDao {

	private static final String SELECT_ALL = "SELECT c FROM Company c WHERE (1=1)";

	public Company getCompany(int id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Company comp = new Company();
		comp = (Company) session.load(Company.class, id);

		try {
			Hibernate.initialize(comp);
			Hibernate.initialize	(comp.getProjects());
			session.getTransaction().commit();
		} catch (Exception ex) {
			session.getTransaction().commit();
			return new Company();
			
		}
		return comp;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Company> getAllCompamies(int size, int pageNumber) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Company> companies = new ArrayList<Company>();

		size = (size > 50 || size < 1) ? 10 : size;
		pageNumber = (pageNumber < 1) ? 1 : pageNumber;

		Query query = session.createQuery(SELECT_ALL);
		query.setMaxResults(size);
		query.setFirstResult(pageNumber);
		companies = query.getResultList();

		Hibernate.initialize(companies);
		companies.stream().forEach(comp -> Hibernate.initialize(comp.getProjects()));
		session.getTransaction().commit();
		return companies;
	}
}
