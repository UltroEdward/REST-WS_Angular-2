package com.measqa.dao;

import com.measqa.dao.interfaces.ArticleDao;
import com.measqa.dao.interfaces.ProjectDao;

public abstract class DaoFactory {

	public static DaoFactory getDaoFactory() {
		return new HibernateFactory();
	}

	public abstract ArticleDao getArticleDao();

	public abstract ProjectDao getProjectDao();

}
