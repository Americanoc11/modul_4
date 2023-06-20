package com.example.webproductmanagement.repository;

import com.example.webproductmanagement.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "Samsung note 8", "Pin trâu hơn samsung 8", 10000.0));
        productList.add(new Product(2, "Samsung note 9", "Pin trâu hơn samsung 9", 20000.0));
        productList.add(new Product(3, "Samsung note 10", "Pin trâu hơn samsung 10", 30000.0));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void create(Product product) {
        System.out.println(productList.size());
        product.setId(productList.size() + 1);
        productList.add(product);
        System.out.println(productList.size());
    }

    @Override
    public Product findById(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void update(Product product) {
        for (Product p : productList) {
            if (p.getId() == product.getId()) {
                p.setId(product.getId());
                p.setName(product.getName());
                p.setDescribe(product.getDescribe());
                p.setPrice(product.getPrice());
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
            }
        }
    }
}
