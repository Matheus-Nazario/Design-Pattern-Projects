package br.org.designparttem.abstractfactory.app;

import br.org.designparttem.abstractfactory.aircraft.IAircraft;
import br.org.designparttem.abstractfactory.factories.ItransportFactory;
import br.org.designparttem.abstractfactory.landvehicle.ILandVehicle;

public  class Application {

    private ILandVehicle vehicle;
    private IAircraft aircraft;
    public Application(ItransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();

    }

    public void StartRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
