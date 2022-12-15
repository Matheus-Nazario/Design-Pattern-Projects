package br.com.bridge.platforms;

public class TwitchTV implements IPlatform{

    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: transmissâo iniciada ");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: Conta Autorizada TwitchTV");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Autorizando o TwitchTV");
    }
}
