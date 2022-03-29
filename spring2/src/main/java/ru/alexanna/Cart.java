package ru.alexanna;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cart {
    private List<Product> products = new ArrayList<>();
    private ProductRepository repository;

    public Cart(ProductRepository repository) {
        this.repository = repository;
    }

    public void addProduct(String id) {
        Optional<Product> product = repository.getProductFromList(id);
        if (product.isPresent())
            products.add(product.get());
    }

    public void removeProduct(String id) {
        Optional<Product> product = repository.getProductFromList(id);
        if (product.isPresent())
            products.remove(product.get());
    }

    public void printContent() {
        products.forEach(System.out::println);
    }

    public ProductRepository getRepository() {
        return repository;
    }
}
