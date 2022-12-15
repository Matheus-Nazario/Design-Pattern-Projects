package br.com.chainofresponsibility;

import br.com.chainofresponsibility.middlewares.CheckPermissionMiddleware;
import br.com.chainofresponsibility.middlewares.CheckUserMiddlewar;
import br.com.chainofresponsibility.middlewares.Middleware;
import br.com.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init(){
        server = new Server();
        server.registerUser("matheus.exemplo@gamil.com", "1254#@578");
        server.registerUser("user.exemplo@gamil.com", "12345678");

        Middleware middleware = new CheckUserMiddlewar(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }
    public static void main(String[] args) throws IOException {

        init();

        boolean done;

        do{
            System.out.println("Digite o e-mail: ");
            String email = reader.readLine();
            System.out.println("Digite a sua senha: ");
            String password = reader.readLine();
            done = server.logIn(email, password);

        }while (!done);

    }
}