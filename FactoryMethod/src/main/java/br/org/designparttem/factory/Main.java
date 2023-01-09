package br.org.designparttem.factory;

/**
 *
 * @author Matheus Nazário
 *
 * Classe principal
 */
public class Main {

    private static Transport transport;
    
    
    /**
     *
     * @author Matheus Nazário
     *
     * @param recebe o tipo de veículo
     * @return Se o Type for diferente de nulo o mesmo roda o methodo "RunTransporte" iniciar a rota.
     */
    public static void main(String[] args) {

        configure(args[0]);
        if(transport!=null){
            runTransport();
        }
    }

    private static void runTransport(){
        transport.startTransport();
    }

    /**
     *
     * @author Matheus Nazário
     *
     * Classe concreta - Produto CarTransport
     *
     * @param recebe o tipo de veículo
     * @return instância o objeto para subclasses da classe principal
     */
    private static void configure(String type) {
        switch (type){
            case"uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            case "eats":
                transport = new BicycleTransport();
                break;
            default:
                System.out.println("Selecione o tipe de entrega");
        }
    }
}