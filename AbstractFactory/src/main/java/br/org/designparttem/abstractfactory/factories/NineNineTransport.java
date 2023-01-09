package br.org.designparttem.abstractfactory.factories;

import br.org.designparttem.abstractfactory.aircraft.Helicopter;
import br.org.designparttem.abstractfactory.aircraft.IAircraft;
import br.org.designparttem.abstractfactory.landvehicle.ILandVehicle;
import br.org.designparttem.abstractfactory.landvehicle.Motorcycle;
/**
 *
 * @author Matheus Nazário
 *
 * Classe 99 Transport
 * @see Iplementa a interface ItransportFactory.
 */
public class NineNineTransport implements ItransportFactory {

    /**
     * @author Matheus Nazário
     * @return retornar um novo objeto moto
     */
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }
    /**
     * @author Matheus Nazário
     * @return retornar um novo objeto aeronove
     */
    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
