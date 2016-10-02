package com.measqa.dao.hibernate;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.measqa.dao.interfaces.CompanyDao;
import com.measqa.entity.portfolio.Company;
import com.measqa.utils.HibernateUtil;

public class CompanyDaoHibImpl implements CompanyDao {

	public Company getCompany(int id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Company comp = new Company();
		comp = (Company) session.load(Company.class, id);
		Hibernate.initialize(comp);
		Hibernate.initialize(comp.getProjects());
		session.getTransaction().commit();
		return comp;
	}
}
