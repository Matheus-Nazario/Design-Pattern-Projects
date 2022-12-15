package br.org.designparttem.abstractfactory.landvehicle;

public class Car implements ILandVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto Car");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos um passageiro, estamos prontos ");
    }
}
