package br.org.designparttem.abstractfactory.factories;

import br.org.designparttem.abstractfactory.aircraft.IAircraft;
import br.org.designparttem.abstractfactory.landvehicle.ILandVehicle;

public interface ItransportFactory {


    ILandVehicle createTransportVehicle();

    IAircraft createTransportAircraft();
}
