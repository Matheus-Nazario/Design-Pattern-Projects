package br.com.facade.systemzipcodeapi;

public class ZipCodeApi {

    private static ZipCodeApi instance = new ZipCodeApi();
    private ZipCodeApi() {
        super();
    }

    public static ZipCodeApi getInstance() {
        return instance;
    }

    public String recoverCity ( String zipCode ){
        return "São Paulo";
    }
}
