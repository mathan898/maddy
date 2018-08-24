package com.niit.backendpro.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.backendpro.DAO.CartDAO;
import com.niit.backendpro.DAO.CartDAOimp;
import com.niit.backendpro.DAO.CategoryDAOimp;
import com.niit.backendpro.DAO.ProductDAO;
import com.niit.backendpro.DAO.ProductDAOimp;
import com.niit.backendpro.DAO.SupplierDAO;
import com.niit.backendpro.DAO.SupplierDAOimp;
import com.niit.backendpro.DAO.UserDAO;
import com.niit.backendpro.DAO.UserDAOimp;
import com.niit.backendpro.model.Cart;
import com.niit.backendpro.model.Category;
import com.niit.backendpro.model.Product;
import com.niit.backendpro.model.Supplier;
import com.niit.backendpro.model.User;

@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class HibernateConfig {
	@Bean(name="dataSource")
	public DataSource getH2DataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/back");
		dataSource.setUsername("sa");
		dataSource.setPassword("sa");

		System.out.println("Data Source Object Created");

		return dataSource;
	}

	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory() {
		Properties properties = new Properties();
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");

		LocalSessionFactoryBuilder sessionFactoryBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
		sessionFactoryBuilder.addProperties(properties);

		sessionFactoryBuilder.addAnnotatedClass(Category.class);
		sessionFactoryBuilder.addAnnotatedClass(Product.class);
		sessionFactoryBuilder.addAnnotatedClass(Supplier.class);
		System.out.println("supplier table created");
		sessionFactoryBuilder.addAnnotatedClass(User.class);
		System.out.println("user table created");
		sessionFactoryBuilder.addAnnotatedClass(Cart.class);

		SessionFactory sessionFactory = sessionFactoryBuilder.buildSessionFactory();

		System.out.println("SessionFactory Object Created");

		return sessionFactory;
	}

	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory) {
		System.out.println("Hibernate Transaction Object Created");
		return new HibernateTransactionManager(sessionFactory);
	}

	@Bean(name = "categoryDAO")
	public CategoryDAOimp getCategoryDAO() {
		System.out.println("Category bean created");
		return new CategoryDAOimp();
	}
@Bean(name="supplierDAO")
	
	public SupplierDAO getSupplierDAO()
	{
		System.out.println("Supplier bean created");
	     return new SupplierDAOimp();
	}
@Bean(name="productDAO")

public ProductDAO getProductDAO()
{
	System.out.println("Product bean created");
     return new ProductDAOimp();
}
@Bean(name="userDAO")

public UserDAO getUserDAO()
{
	System.out.println("User bean created");
     return new UserDAOimp();
}
@Bean(name="cartDAO")

public CartDAO getCartDAO()
{
	System.out.println("Cart bean created");
     return new CartDAOimp();
}


}
