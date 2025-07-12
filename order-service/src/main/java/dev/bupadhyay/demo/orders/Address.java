package dev.bupadhyay.demo.orders;

public record Address(
        String line1,
        String line2,
        String state,
        String zipCode,
        String country) {

}
