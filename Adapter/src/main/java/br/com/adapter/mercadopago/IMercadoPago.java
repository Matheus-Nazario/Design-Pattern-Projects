package br.com.adapter.mercadopago;

import br.com.adapter.utils.Token;

public interface IMercadoPago {
    Token authToken();
    void sendMercadoPago();
    void receiveMercadoPago();
}
