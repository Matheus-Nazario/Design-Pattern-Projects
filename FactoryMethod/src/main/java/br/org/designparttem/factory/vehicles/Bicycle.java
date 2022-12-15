package br.org.designparttem.factory.vehicles;

public class Bicycle implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o Delivery");

    }

    @Override
    public void getCargo() {
        System.out.println("Já Pegamos a comida");
    }
}
