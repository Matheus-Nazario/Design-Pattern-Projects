package br.com.adapter.adapters;

import br.com.adapter.payonner.Payoneer;
import br.com.adapter.paypal.IPayPalPayments;
import br.com.adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o payoneer utilizando os métodos do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void payPalPayment() {
        this.payoneer.sendPayPayment();
    }

    @Override
    public void payPalReceive() {
        this.payoneer.receivePayPayment();

    }
}
