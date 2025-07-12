package dev.bupadhyay.demo.orders;

public record Customer(
        String customerId,
        String name,
        String address,
        String contactNumber) {

}
