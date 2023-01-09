package br.org.designparttem.factory;

import br.org.designparttem.factory.vehicles.Car;
import br.org.designparttem.factory.vehicles.IVehicle;

/**
 *
 * @author Matheus Nazário
 *
 * Classe concreta - Produto CarTransport
 *
 * @see extende de transporte para criar trasnporte car
 */
public class CarTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
