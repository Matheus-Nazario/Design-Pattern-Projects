package br.org.designparttem.abstractfactory.factories;

import br.org.designparttem.abstractfactory.aircraft.Airplane;
import br.org.designparttem.abstractfactory.aircraft.IAircraft;
import br.org.designparttem.abstractfactory.landvehicle.Car;
import br.org.designparttem.abstractfactory.landvehicle.ILandVehicle;
/**
 *
 * @author Matheus Nazário
 *
 * Classe Uber Transport
 * @see Iplementa a interface ItransportFactory.
 */
public class UberTransport implements ItransportFactory  {
    /**
     * @author Matheus Nazário
     * @return retornar um novo objeto carro
     */
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }
    /**
     * @author Matheus Nazário
     * @return retornar um novo objeto aeronove
     */
    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
