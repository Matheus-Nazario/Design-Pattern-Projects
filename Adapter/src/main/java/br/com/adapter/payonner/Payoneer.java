package br.com.adapter.payonner;

import br.com.adapter.utils.Token;

public class Payoneer implements IPayonnerPayments{

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayPayment() {

        System.out.println("Enviando pagamentos via Payoneer");

    }

    @Override
    public void receivePayPayment() {
        System.out.println("Recebendo pagamentos via Payoneer");
    }
}
