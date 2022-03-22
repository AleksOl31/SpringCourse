package ru.alexanna.servlet;

import ru.alexanna.servlet.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("product", createProduct());
        getServletContext().getRequestDispatcher("/products.jsp")
                .forward(req, resp);
    }

    private Product createProduct() {
        List<Product> productList = Arrays.asList(
                new Product(1, "iPhone 11", 70, null),
                new Product(2, "iPhone 11 Pro", 80, null),
                new Product(3, "iPhone 11 Pro Max", 90, null),
                new Product(4, "iPhone 12", 100, null),
                new Product(5, "iPhone 13", 110, null),
                new Product(6, "Samsung A40", 50, null),
                new Product(7, "Honor", 55, null),
                new Product(8, "Xiaomi Redmi 9", 20, null),
                new Product(9, "Xiaomi Redmi 9C", 30, null),
                new Product(10, "Samsung", 20, null)
        );
        return Product.builder()
                .title("Phones")
                .products(productList)
                .build();
    }
}
