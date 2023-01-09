package br.org.designparttem.factory.vehicles;
/**
 *
 * @author Matheus Nazário
 *
 * Classe modelo de "Motorcycle"
 * @see Iplementa a interface veículos.
 */
public class Motorcycle implements IVehicle{
    /**
     *
     * @author Matheus Nazário
     *
     * @return exibe a carga e inicia a corrida
     */
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega!");
    }

    @Override
    public void getCargo() {

        System.out.println("Já pegamos a encomenda.");

    }
}
