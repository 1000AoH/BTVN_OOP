package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> list = new ArrayList<Product>();
    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    newProduct();
                    break;
                case 2:
                    productListInfo();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }

    }

    private static void productListInfo() {
        System.out.println(list);
    }

    private static void newProduct() {
        System.out.println("Enter product code: ");
        String code = scanner.nextLine();
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product description: ");
        String description = scanner.nextLine();
        System.out.println("Enter product quantity: ");
        String quantity = scanner.nextLine();
        System.out.println("Enter product price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter product type: ");
        String type = scanner.nextLine();
        Product product = new Product(code,name,description,quantity,price,type);
        list.add(product);
    }

    private static void searchProduct() {
        System.out.print("Product to search for: ");
        String searchItem = scanner.nextLine();
        int count = 0;
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getName().equals(searchItem)){
                System.out.println("The item is in the list");
                System.out.println(list.get(i));
                count ++;
            }
        }
        if (count==0){
            System.out.println("The item is not in the list! Please add a new one.");
        }
    }

    private static void printInstruction() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print options.");
        System.out.println("\t 1 - To add product to the list.");
        System.out.println("\t 2 - To check the list of product.");
        System.out.println("\t 3 - To search for a product.");
        System.out.println("\t 4 - To quit the program.");
    }
}
