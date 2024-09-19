package com.one.spring;

import com.one.spring.database.pool.ConnectionPool;
import com.one.spring.database.repository.CompanyRepository;
import com.one.spring.database.repository.UserRepository;
import com.one.spring.ioc.Container;
import com.one.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {

        {
//            var container = new Container();
//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//        var userService = new UserService(userRepository, companyRepository);

//        var connectionPool = container.get(ConnectionPool.class);
//        var userRepository = container.get(UserRepository.class);
//        var companyRepository = container.get(CompanyRepository.class);
//        var userService = container.get(UserService.class);


            // TODO: 17.09.2024 userService
        }

        var context = new ClassPathXmlApplicationContext("application.xml");

        var connectionPool = context.getBean("pool1", ConnectionPool.class);

//        System.out.println(context.getBean("pool2"));
    }
}
