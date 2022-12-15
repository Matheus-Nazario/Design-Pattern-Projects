package br.com.builder.builders;

import br.com.builder.cars.Car;
import br.com.builder.components.CarType;
import br.com.builder.components.Color;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class CarBuilder implements IBuilder {

    private  CarType carType;
    private  Color color;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;

    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Car getResult(){
        return  new Car(carType, seats, engine, transmission, color);
    }
}
