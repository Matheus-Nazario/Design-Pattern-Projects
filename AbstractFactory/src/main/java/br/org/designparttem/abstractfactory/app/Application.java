package br.org.designparttem.abstractfactory.app;

import br.org.designparttem.abstractfactory.aircraft.IAircraft;
import br.org.designparttem.abstractfactory.factories.ItransportFactory;
import br.org.designparttem.abstractfactory.landvehicle.ILandVehicle;
/**
 * @author Matheus Nazário
 * Classe da Aplicação é a confiração da aplicação
 */
public  class Application {

    private ILandVehicle vehicle;
    private IAircraft aircraft;

    /**
     * @author Matheus Nazário
     * @param objeto instaciado da compania, se é o uber, 99, boat
     * @return A criação do vehicle e do aircraft
     */
    public Application(ItransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();

    }
    /**
     * @author Matheus Nazário
     * @return O Start do vehicle e do aircraft para iniciar a rota
     */
    public void StartRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
