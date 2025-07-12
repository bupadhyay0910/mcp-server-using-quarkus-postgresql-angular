package dev.bupadhyay.demo.orders;

import java.math.BigDecimal;
import java.util.List;

public record Order(
        String orderId,
        Customer customer,
        BigDecimal totalPrice,
        String customerNote,
        List<OrderItem> orderItems) {

}
