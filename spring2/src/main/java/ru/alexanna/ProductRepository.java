package ru.alexanna;

import java.util.*;

public class ProductRepository {
    private List<Product> productList;

    public ProductRepository() {
        productList = new ArrayList<>();
    }

    public void addProductToList(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Optional<Product> getProductFromList(String id) {
        return productList.stream().filter(product -> product.getId().equals(id)).findFirst();
    }

    public void printContent() {
        productList.forEach(System.out::println);
    }
}
