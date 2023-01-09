package br.org.designparttem.factory.vehicles;
/**
 *
 * @author Matheus Nazário
 *
 * Classe modelo de "Car"
 * @see Iplementa a interface veículos.
 */
public class Car implements IVehicle{
    /**
     *
     * @author Matheus Nazário
     *
     * @return exibe a carga e inicia a corrida
     */
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos um passageiro, estamos prontos ");
    }
}
