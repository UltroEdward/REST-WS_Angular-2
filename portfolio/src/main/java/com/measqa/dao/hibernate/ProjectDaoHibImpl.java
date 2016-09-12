package com.measqa.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.measqa.dao.interfaces.ProjectDao;
import com.measqa.entity.portfolio.Project;
import com.measqa.utils.HibernateUtil;

public class ProjectDaoHibImpl implements ProjectDao {

	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<Project>();
		Project project = new Project();
		project.setName("FICO");
		projects.add(project);
		return projects;
	}

	public Project getProject(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Project project = new Project();
		project = (Project) session.load(Project.class, id);
		Hibernate.initialize(project);
		session.getTransaction().commit();
		session.close();
		return project;
	}
}
