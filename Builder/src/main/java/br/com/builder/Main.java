package br.com.builder;

import br.com.builder.builders.CarBuilder;
import br.com.builder.builders.TruckBuilder;
import br.com.builder.cars.Car;
import br.com.builder.cars.Truck;
import br.com.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        //criando carro
        CarBuilder builderCar = new CarBuilder();
        director.constructSedanCar(builderCar);

        Car car = builderCar.getResult();
        System.out.println(car.getCarType() + " Produzido com sucesso");

        //criando caminhao
        TruckBuilder builderTruck = new TruckBuilder();
        director.constructTruck(builderTruck);

        Truck truck = builderTruck.getResult();
        System.out.println(truck.result() + " Produzido com sucesso");

        //criando carro esportivo
        CarBuilder builderCarSport = new CarBuilder();
        director.constructSportCar(builderCarSport);

        Car SportCar = builderCarSport.getResult();
        System.out.println(SportCar.getCarType() + " Produzido com sucesso");

    }
}