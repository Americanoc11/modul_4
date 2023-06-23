package com.example.product_management.repository;

import com.example.product_management.model.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static final String SELECT_ALL = "FROM Product";
    private static final String SELECT_BY_ID = "FROM Product WHERE id= :id";

//    String queryStr = "SELECT c FROM Customer AS c WHERE c.id = :id";
//    TypedQuery<Customer> query = entityManager.createQuery(queryStr, Customer.class);
//        query.setParameter("id", id);
//        return query.getSingleResult();

    @Override
    public List<Product> findAll() {
        return ConnectionUtils.getEntityManager().createQuery(SELECT_ALL).getResultList();
    }

    @Override
    public void create(Product product) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void delete(Integer id) {
        Session session;
        Transaction transaction;
        try {
            Product product = findOne(id);
            session = ConnectionUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(product);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product findOne(Integer id) {
        String queryStr = SELECT_BY_ID;
        TypedQuery<Product> query = ConnectionUtils.getEntityManager().createQuery(queryStr, Product.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void update(Product product) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(product);
            transaction.commit();
            ConnectionUtils.getEntityManager().clear();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean checkProduct(int id) {
        List<Product> productList = this.findAll();
        for (Product p : productList) {
            if (p.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
