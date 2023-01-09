package br.org.designparttem.factory;

import br.org.designparttem.factory.vehicles.IVehicle;
/**
 *
 * @author Matheus Nazário
 *
 * Classe abstrata esse é o Factory Method
 */
public abstract class Transport {

        void startTransport(){
            IVehicle vehicle = createTransport();
            vehicle.startRoute();

        }

        protected abstract IVehicle createTransport();
}
