package com.measqa.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HibernateUtil {

	private static Logger LOG = LoggerFactory.getLogger(HibernateUtil.class);
	private static SessionFactory sessionFactory = buildSessionFactory();

	protected static SessionFactory buildSessionFactory() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			LOG.error("Session factory creation fail due to: {}", e.getMessage());
			StandardServiceRegistryBuilder.destroy(registry);
			throw new ExceptionInInitializerError("Initial SessionFactory failed" + e);
		}
		LOG.debug("Session factory created");
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		LOG.warn("Destroying session factory");
		getSessionFactory().close();
	}

	public static String cleanString(String dirty, String unwantedChars) {
		if (dirty.contains(unwantedChars)) {
			return dirty.replace(unwantedChars, "");
		}
		return dirty;
	}
	
	public static void main(String [] args){
		System.out.println(cleanString("asdsaasd", "a"));
	}

}