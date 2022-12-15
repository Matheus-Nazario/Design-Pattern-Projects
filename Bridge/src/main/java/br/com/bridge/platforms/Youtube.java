package br.com.bridge.platforms;

public class Youtube implements IPlatform {

    public Youtube() {
        configureRMTP();
        System.out.println("Youtube:  transmissâo iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Youtube:  Conta Autorizada Youtube");
    }

    @Override
    public void authToken() {
        System.out.println("Youtube:  Autorizando o Youtube");
    }
}
