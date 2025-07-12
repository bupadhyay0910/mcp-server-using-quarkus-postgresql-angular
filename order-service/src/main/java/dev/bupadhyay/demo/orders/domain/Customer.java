package dev.bupadhyay.demo.orders.domain;

public record Customer(
        String customerId,
        String name,
        String address,
        String contactNumber) {

}
