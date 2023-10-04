package edu.miu.cs.cs489appsd.lab1a;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class productmgmtapp {
    static void printProducts (Product[]products) {
        printInJSONFormat(products);
        printInXMLFormat(products);
        printInCSVFormat(products);
    }

    private static void printInCSVFormat(Product[] products) {
        System.out.println("Comma-Separated Values (CSV)-formatted list of all Products");
        // Sort products by name before printing
        sortProductsByName(products);
        System.out.println("ID, Name, Date, Quantity, Price");
        for (Product product : products) {
            System.out.println(product.productId()+", "+ product.productName()+", "+ product.dateSupplied()+ ", "+product.quantityInStock()+", "+ product.unitPrice());
        }
    }

    private static void sortProductsByName(Product[] products) {
        /* Use Arrays.sort and a custom Comparator to sort products by name */
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product1.productName().compareTo(product2.productName());
            }
        });
    }

    private static void printInXMLFormat(Product[] products) {
        System.out.println("XML-formatted list of all Products:");
        System.out.println("<Products>");
        for (Product product : products) {
            System.out.println("  <Product>");
            System.out.println("    <ID>" + product.productName() + "</ID>");
            System.out.println("    <Name>" + product.productId() + "</Name>");
            System.out.println("    <ExpiryDate>" + product.dateSupplied() + "</ExpiryDate>");
            System.out.println("    <Quantity>" + product.quantityInStock() + "</Quantity>");
            System.out.println("    <Price>" + product.unitPrice() + "</Price>");
            System.out.println("  </Product>");
        }
        System.out.println("</Products>");
    }

    private static void printInJSONFormat(Product[] products) {
        System.out.println("JSON-formatted list of all Products:");
        System.out.println("[");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println("  {");
            System.out.println("    \"ID\": \"" + product.productId() + "\",");
            System.out.println("    \"Name\": \"" + product.productName() + "\",");
            System.out.println("    \"ExpiryDate\": \"" + product.dateSupplied() + "\",");
            System.out.println("    \"Quantity\": " + product.quantityInStock() + ",");
            System.out.println("    \"Price\": " + product.unitPrice());
            System.out.println("  }" + (i < products.length - 1 ? "," : ""));
        }
        System.out.println("]");
    }

    public static void main(String[]strings) {
        Product []products = {
                new Product("123", "Apple", LocalDate.of(2023,12,9), 18, 1.09),
                new Product("245", "Banana", LocalDate.of(2023,01,24), 124, 0.55),
                new Product("356", "Carrot", LocalDate.of(2023,03,31), 89, 2.99)
        };
        printProducts(products);
    }
}
