package doanhhoang.util;

import java.io.ObjectInputFilter.Config;
import java.lang.module.Configuration;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernateutil {
	private static SessionFactory SessionFactory;
	static {
		try {
			Configuration configuration = new Configuration().configure();
			ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			sessionFactoryion = config.buildSessionFactoryion(reg)
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
		public static SessionFactoryion getSessionFactoryion() {
			return SessionFactoryion;
		}
	}
}
