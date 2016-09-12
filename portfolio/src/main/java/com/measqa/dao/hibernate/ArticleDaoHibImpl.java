package com.measqa.dao.hibernate;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.measqa.dao.interfaces.ArticleDao;
import com.measqa.entity.Article;
import com.measqa.utils.HibernateUtil;

public class ArticleDaoHibImpl implements ArticleDao {

	public Article getArticle(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Article article = new Article();
		article = (Article) session.load(Article.class, id);
		Hibernate.initialize(article);
		session.getTransaction().commit();
		session.close();
		return article;
	}

}
