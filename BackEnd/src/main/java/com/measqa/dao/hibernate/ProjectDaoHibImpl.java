package com.measqa.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.measqa.dao.interfaces.ProjectDao;
import com.measqa.entity.Project;
import com.measqa.utils.HibernateUtil;

public class ProjectDaoHibImpl implements ProjectDao {

	public Project getProject(int id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Project project = new Project();
		project = (Project) session.load(Project.class, id);
		Hibernate.initialize(project);
		session.getTransaction().commit();
		return project;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Project> getAllProjects() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Project> projects = new ArrayList<Project>();
		projects = session.createCriteria(Project.class).list();
		Hibernate.initialize(projects);
		session.getTransaction().commit();
		return projects;
	}

}
