package com.measqa.dao.hibernate;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.measqa.dao.interfaces.ArticleDao;
import com.measqa.entity.Article;
import com.measqa.utils.HibernateUtil;

public class ArticleDaoHibImpl implements ArticleDao {

	public Article getArticle(int id) {
	    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Article article = new Article();
		article = (Article) session.load(Article.class, id);
		
		try {
			Hibernate.initialize(article);
			session.getTransaction().commit();
		} catch (Exception ex) {
			session.getTransaction().commit();
			return new Article();	
		}

		return article;
	}

}
