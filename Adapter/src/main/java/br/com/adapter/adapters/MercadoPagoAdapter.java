package br.com.adapter.adapters;

import br.com.adapter.mercadopago.MercadoPago;
import br.com.adapter.paypal.IPayPalPayments;
import br.com.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void payPalPayment() {
        this.mercadoPago.sendMercadoPago();
    }

    @Override
    public void payPalReceive() {
        this.mercadoPago.receiveMercadoPago();
    }
}
