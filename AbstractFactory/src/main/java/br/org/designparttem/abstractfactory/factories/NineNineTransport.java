package br.org.designparttem.abstractfactory.factories;

import br.org.designparttem.abstractfactory.aircraft.Airplane;
import br.org.designparttem.abstractfactory.aircraft.Helicopter;
import br.org.designparttem.abstractfactory.aircraft.IAircraft;
import br.org.designparttem.abstractfactory.landvehicle.Car;
import br.org.designparttem.abstractfactory.landvehicle.ILandVehicle;
import br.org.designparttem.abstractfactory.landvehicle.Motorcycle;

public class NineNineTransport implements ItransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
