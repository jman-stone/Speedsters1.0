package com.example.speedsters1_0;

public class Payment implements paymentInterface {
    private String cardNumber;
    private String routingNumber;
    public Payment(String cardNumber, String routingNumber) {
        this.cardNumber = cardNumber;
        this.routingNumber = routingNumber;
    }
    //leaving this for later
    @Override
    public void processPayment() {

    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String getRoutingNumber() {
        return routingNumber;
    }
}
