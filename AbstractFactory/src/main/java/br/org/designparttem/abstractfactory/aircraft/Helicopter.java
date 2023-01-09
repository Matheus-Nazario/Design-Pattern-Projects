package br.org.designparttem.abstractfactory.aircraft;
/**
 * @author Matheus Nazário
 * @see  implementa a insterface IAircraft
 */
public class Helicopter implements IAircraft {
    /**
     * @author Matheus Nazário
     * @return starta a rota, com as informaçõe do Vento, com a carga do Airplane
     */
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }
    /**
     * @author Matheus Nazário
     * @return informações da carga
     */
    @Override
    public void getCargo() {

        System.out.println("Pegamos um passageiro, ligando hélices ");
    }
    /**
     * @author Matheus Nazário
     * @return informações do vento
     */
    @Override
    public void wind() {
        System.out.println("ventos a 30k,ventos ok!");

    }

}
