package com.training.java.config;

import com.training.java.dao.UserDao;
import com.training.java.dao.UserDaoImpl;
import com.training.java.service.UserService;
import com.training.java.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * SpringConfig.
 *
 * @author Aleksey_Lukyanov
 */
@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb?useSsl=false");
        dataSource.setUsername("root");
        dataSource.setPassword("Jfpv20g2f");

        Properties properties = new Properties();
        properties.setProperty("serverTimezone", "UTC");
        dataSource.setConnectionProperties(properties);

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Bean
    UserDao getUserDao() {
        return new UserDaoImpl(getJdbcTemplate());
    }

    @Bean
    UserService getUserService() {
        return new UserServiceImpl();
    }
}
