package br.org.designparttem.abstractfactory;

import br.org.designparttem.abstractfactory.app.Application;
import br.org.designparttem.abstractfactory.factories.BoatTransport;
import br.org.designparttem.abstractfactory.factories.ItransportFactory;
import br.org.designparttem.abstractfactory.factories.NineNineTransport;
import br.org.designparttem.abstractfactory.factories.UberTransport;
/**
 *
 * @author Matheus Nazário
 *
 * Classe principal
 */
public class Main {
    /**
     * @author Matheus Nazário
     * @return um objeto instaciado definindo a compania
     */
    public static Application configureApplication(){
        Application app;
        ItransportFactory factory;

        String company= "Boat";
        if (company=="Uber"){
            factory = new UberTransport();
        } else if (company=="Boat") {
            factory = new BoatTransport();

        } else {
            factory = new NineNineTransport();
        }

        app =new Application(factory);
        return  app;
    }

    public static void main(String[] args) {

        Application app = configureApplication();
        app.StartRoute();

    }
}