package br.com.chainofresponsibility.middlewares;


public class CheckPermissionMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {

        if(email.equals("matheus.exemplo@gamil.com")){
            System.out.println("bem vindo Adinistrador!");
            return true;
        }
            System.out.println("bem vindo!");
        return checkNext(email, password);
    }
}
