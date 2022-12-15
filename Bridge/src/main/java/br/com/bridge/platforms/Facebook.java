package br.com.bridge.platforms;

public class Facebook implements IPlatform{

    public Facebook() {
        configureRMTP();
        System.out.println("Facebook: transmissâo iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Conta Autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook:Autorizando o facebook");
    }
}
