package br.org.designparttem.abstractfactory.aircraft;

public class Boat implements IAircraft{
    @Override
    public void startRoute() {

        getCargo();
        System.out.println("iniciando a embracação");
    }

    @Override
    public void getCargo() {
        System.out.println("entranado os passgeiros");

    }

    @Override
    public void wind() {

    }
}
