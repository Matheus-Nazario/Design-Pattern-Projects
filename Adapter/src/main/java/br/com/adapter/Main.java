package br.com.adapter;

import br.com.adapter.adapters.MercadoPagoAdapter;
import br.com.adapter.adapters.PayoneerAdapter;
import br.com.adapter.mercadopago.MercadoPago;
import br.com.adapter.payonner.Payoneer;
import br.com.adapter.paypal.IPayPalPayments;
import br.com.adapter.paypal.PayPal;

public class Main {
    public static void main(String[] args) {

//        IPayPalPayments payments = new PayoneerAdapter(new Payoneer());
//
//        payments.payPalPayment();
//        payments.payPalReceive();

            IPayPalPayments payments = new MercadoPagoAdapter(new MercadoPago());
            payments.payPalPayment();
            payments.payPalReceive();


    }
}