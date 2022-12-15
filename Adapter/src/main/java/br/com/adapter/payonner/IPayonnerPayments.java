package br.com.adapter.payonner;

import br.com.adapter.utils.Token;

public interface IPayonnerPayments {

    Token authToken();
    void sendPayPayment();
    void receivePayPayment();
}
