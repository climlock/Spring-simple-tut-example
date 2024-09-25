package com.one.spring.database.repository;

import com.one.spring.bpp.Auditing;
import com.one.spring.bpp.InjectBean;
import com.one.spring.bpp.Transaction;
import com.one.spring.database.entity.Company;
import com.one.spring.database.pool.ConnectionPool;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {
    @InjectBean
    private ConnectionPool connectionPool;

    @PostConstruct
    private void init() {
        System.out.println("CompanyRepository init");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("Find by method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void deleteById(Company entity) {
        System.out.println("Delete by method...");
    }
}
