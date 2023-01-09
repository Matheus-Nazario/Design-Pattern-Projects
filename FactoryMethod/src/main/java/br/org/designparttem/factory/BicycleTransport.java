package br.org.designparttem.factory;

import br.org.designparttem.factory.vehicles.Bicycle;
import br.org.designparttem.factory.vehicles.IVehicle;
/**
 *
 * @author Matheus Nazário
 *
 * Classe concreta - Produto CarTransport
 *
 * @see extende de transporte para criar trasnporte Bicycle
 */
public class BicycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bicycle();
    }
}
