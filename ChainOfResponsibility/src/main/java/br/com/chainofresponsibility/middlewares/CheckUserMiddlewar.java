package br.com.chainofresponsibility.middlewares;

import br.com.chainofresponsibility.server.Server;

public class CheckUserMiddlewar extends Middleware{

    private Server server;

    public CheckUserMiddlewar(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("E-mail inválido");
            return false;
        }
        if (!server.isValidPassword(email, password)){
            System.out.println("E-mail ou Senha inválida");
            return false;
        }
        return checkNext(email, password);
    }
}
