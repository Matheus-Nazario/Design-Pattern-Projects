package br.com.facade.systemcrmdateclient;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void registerClient(String name, String zipcode, String city){
        System.out.println("Cliente Salvo no systema do CRM");

    }
}
