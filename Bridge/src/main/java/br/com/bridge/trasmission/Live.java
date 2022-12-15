package br.com.bridge.trasmission;

import br.com.bridge.platforms.IPlatform;

public class Live implements ITrasmission {
    protected IPlatform platform;

    //Polimorfismo
    public  Live(IPlatform platform){
        this.platform = platform;
    }

    public Live() {
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando a transmissão");
    }

    @Override
    public void result() {
        System.out.println("*** ON AIR *****");
    }
}
