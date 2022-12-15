package br.org.designparttem.factory;

import br.org.designparttem.factory.vehicles.IVehicle;

public abstract class Transport {

        void startTransport(){
            IVehicle vehicle = createTransport();
            vehicle.startRoute();

        }

        protected abstract IVehicle createTransport();
}
