package br.org.designparttem.abstractfactory.aircraft;

public class Airplane implements IAircraft {


    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos um passageiro, , ligando hélices ");
    }

    @Override
    public void wind() {
        System.out.println("ventos a 30k,ventos ok!");
    }
}
