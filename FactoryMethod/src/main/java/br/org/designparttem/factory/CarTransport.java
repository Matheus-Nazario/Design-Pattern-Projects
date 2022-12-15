package br.org.designparttem.factory;

import br.org.designparttem.factory.vehicles.Car;
import br.org.designparttem.factory.vehicles.IVehicle;

public class CarTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
