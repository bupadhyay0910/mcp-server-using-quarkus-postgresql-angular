package dev.bupadhyay.demo.orders.domain;

public record OrderItem(
        Product product,
        Integer quantity,
        Price price,
        Discount discount) {

}
