package br.com.adapter.mercadopago;

import br.com.adapter.utils.Token;

public class MercadoPago implements IMercadoPago{

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendMercadoPago() {

        System.out.println("Enviando pagamentos via MercadoPago");

    }

    @Override
    public void receiveMercadoPago() {
        System.out.println("Recebendo pagamentos via MercadoPago");
    }
}
