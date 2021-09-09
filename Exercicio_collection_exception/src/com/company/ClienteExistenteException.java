package com.company;

public class ClienteExistenteException extends RuntimeException{

    private static final long serialVersionUID = -1187460338521076577L;

    public ClienteExistenteException(String mensagem) {
        super(mensagem);
    }
}
