package br.org.designparttem.abstractfactory.landvehicle;

public class Motorcycle implements ILandVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega Motorcycle!");
    }

    @Override
    public void getCargo() {

        System.out.println("Já pegamos a encomenda.");

    }
}
