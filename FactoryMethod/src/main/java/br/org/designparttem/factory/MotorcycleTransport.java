package br.org.designparttem.factory;

import br.org.designparttem.factory.vehicles.IVehicle;
import br.org.designparttem.factory.vehicles.Motorcycle;
/**
 *
 * @author Matheus Nazário
 *
 * Classe concreta - Produto CarTransport
 *
 * @see extende de transporte para criar trasnporte Motorcycle
 */
public class MotorcycleTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
