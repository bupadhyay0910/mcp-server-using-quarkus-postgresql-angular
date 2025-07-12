package dev.bupadhyay.demo.orders;

public record OrderItem(
        Product product,
        Integer quantity,
        Price price,
        Discount discount) {

}
