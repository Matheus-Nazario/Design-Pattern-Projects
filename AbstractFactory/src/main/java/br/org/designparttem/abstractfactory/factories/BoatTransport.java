package br.org.designparttem.abstractfactory.factories;

import br.org.designparttem.abstractfactory.aircraft.Boat;
import br.org.designparttem.abstractfactory.aircraft.IAircraft;
import br.org.designparttem.abstractfactory.landvehicle.Car;
import br.org.designparttem.abstractfactory.landvehicle.ILandVehicle;

public class BoatTransport implements ItransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Boat();
    }
}
