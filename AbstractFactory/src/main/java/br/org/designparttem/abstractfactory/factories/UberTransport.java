package br.org.designparttem.abstractfactory.factories;

import br.org.designparttem.abstractfactory.aircraft.Airplane;
import br.org.designparttem.abstractfactory.aircraft.IAircraft;
import br.org.designparttem.abstractfactory.landvehicle.Car;
import br.org.designparttem.abstractfactory.landvehicle.ILandVehicle;

public class UberTransport implements ItransportFactory  {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
