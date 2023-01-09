package br.org.designparttem.abstractfactory.aircraft;
/**
 * @author Matheus Nazário
 * @see  implementa a insterface IAircraft
 */
public class Boat implements IAircraft{

    /**
     * @author Matheus Nazário
     * @return inicia a rota
     */
    @Override
    public void startRoute() {

        getCargo();
        System.out.println("iniciando a embracação");
    }
    /**
     * @author Matheus Nazário
     * @return informações da carga
     */
    @Override
    public void getCargo() {
        System.out.println("entranado os passgeiros");

    }
    /**
     * @author Matheus Nazário
     * @return informações do vento
     */
    @Override
    public void wind() {

    }
}
