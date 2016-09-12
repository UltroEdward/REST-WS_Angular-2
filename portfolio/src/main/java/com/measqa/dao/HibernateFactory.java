package com.measqa.dao;

import com.measqa.dao.hibernate.ArticleDaoHibImpl;
import com.measqa.dao.hibernate.ProjectDaoHibImpl;
import com.measqa.dao.interfaces.ArticleDao;
import com.measqa.dao.interfaces.ProjectDao;

public class HibernateFactory extends DaoFactory {
	
	@Override
	public ArticleDao getArticleDao() {
		return new ArticleDaoHibImpl();
	}

	@Override
	public ProjectDao getProjectDao() {
		return new ProjectDaoHibImpl();
	}

}
