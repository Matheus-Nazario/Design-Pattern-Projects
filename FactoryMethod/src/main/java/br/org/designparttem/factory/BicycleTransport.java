package br.org.designparttem.factory;

import br.org.designparttem.factory.vehicles.Bicycle;
import br.org.designparttem.factory.vehicles.IVehicle;

public class BicycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bicycle();
    }
}
