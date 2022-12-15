package br.com.adapter.paypal;

import br.com.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void payPalPayment();
    void payPalReceive();
}
