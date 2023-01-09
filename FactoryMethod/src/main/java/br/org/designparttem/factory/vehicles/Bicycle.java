package br.org.designparttem.factory.vehicles;
/**
 *
 * @author Matheus Nazário
 *
 * Classe modelo de "Bicycle"
 * @see Iplementa a interface veículos.
 */
public class Bicycle implements IVehicle{

    /**
     *
     * @author Matheus Nazário
     *
     * @return exibe a carga e inicia a corrida
     */
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o Delivery");

    }

    @Override
    public void getCargo() {
        System.out.println("Já Pegamos a comida");
    }
}
