package ru.alexanna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Cart cart = ctx.getBean("cart", Cart.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - print Product Repository; 2 - print Cart Content; 3 - add to Cart; 4 - remove from Cart");

        while (scanner.hasNextInt()) {
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    cart.getRepository().printContent();
                    break;
                case 2:
                    cart.printContent();
                    break;
                case 3:
                    addToCart(cart);
                    break;
                case 4:
                    removeFromCart(cart);
                    break;
            }
        }
    }

    private static void removeFromCart(Cart cart) {
        System.out.println("Enter product ID to remove");
        String productId = in.nextLine();
        cart.removeProduct(productId);
    }

    private static void addToCart(Cart cart) {
        System.out.println("Enter product ID to add");
        String productId = in.nextLine();
        cart.addProduct(productId);
    }
}
