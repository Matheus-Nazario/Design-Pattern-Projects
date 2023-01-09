package br.org.designparttem.abstractfactory.factories;

import br.org.designparttem.abstractfactory.aircraft.IAircraft;
import br.org.designparttem.abstractfactory.landvehicle.ILandVehicle;
/**
 * @author Matheus Nazário
 * interface Factore para criar tipo de trasnporte terrestre e aéreo.
 */
public interface ItransportFactory {


    ILandVehicle createTransportVehicle();

    IAircraft createTransportAircraft();
}
