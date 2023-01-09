package br.com.adapter.paypal;

import br.com.adapter.utils.Token;

public class PayPal implements IPayPalPayments{

    private Token token;
    
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void payPalPayment() {

        this.token = authToken();
        System.out.println("Enviando pagamentos via Paypal");

    }

    @Override
    public void payPalReceive() {
        System.out.println("Recebendo pagamentos via Paypal");

    }
}
