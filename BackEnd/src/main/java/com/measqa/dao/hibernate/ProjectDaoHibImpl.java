package com.measqa.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.measqa.dao.interfaces.ProjectDao;
import com.measqa.entity.Project;
import com.measqa.utils.HibernateUtil;

public class ProjectDaoHibImpl implements ProjectDao {

	private static final String SELECT_ALL = "SELECT p FROM Projects p WHERE (1=1)";

	public Project getProject(int id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Project project = new Project();
		project = (Project) session.load(Project.class, id);

		try {
			Hibernate.initialize(project);
			session.getTransaction().commit();
		} catch (Exception ex) {
			session.getTransaction().commit();
			return new Project();

		}
	
		return project;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> getAllProjects() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Project> projects = new ArrayList<Project>();
		Query query = session.createQuery(SELECT_ALL);
		projects = query.getResultList();
		Hibernate.initialize(projects);
		session.getTransaction().commit();
		return projects;
	}

}
