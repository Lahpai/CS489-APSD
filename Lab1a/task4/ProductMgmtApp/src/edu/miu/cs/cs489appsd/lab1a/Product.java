package edu.miu.cs.cs489appsd.lab1a;

import java.time.LocalDate;

public record Product(String productId, String productName, LocalDate dateSupplied, int quantityInStock, double unitPrice) {

//    public boolean toCSVString() {
//        return false;
//    }


}
