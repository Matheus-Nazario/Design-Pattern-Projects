package br.com.chainofresponsibility.server;

import br.com.chainofresponsibility.middlewares.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware){
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password){
        if(middleware.check(email, password)){
            System.out.println("Usúario autenticado");
            System.out.println("bem vindo!!!");
            return true;
        }
        return false;
    }

    public void registerUser(String email, String password){
        users.put(email, password);
    }

    public Boolean hasEmail(String email){

        return users.containsKey(email);
    }

    public Boolean isValidPassword(String email, String password){

        return users.get(email).equals(password);
    }


}
