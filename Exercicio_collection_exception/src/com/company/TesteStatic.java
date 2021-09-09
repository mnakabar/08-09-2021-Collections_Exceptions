package com.company;

import java.time.LocalDate;
import java.util.List;

public class TesteStatic {

    public static void main(String[] args) {
        ClienteService service1 = new ClienteService();

        service1.adiciona(new Cliente("Danilo", LocalDate.parse("1991-09-05")));
        service1.adiciona(new Cliente("Jenifer", LocalDate.parse("1991-09-10")));
        service1.adiciona(new Cliente("filipe", LocalDate.parse("1997-12-18")));


        ClienteService service2 = new ClienteService();
        List<Cliente> listagem = service2.listagem();

        for (Cliente cliente : listagem) {
            System.out.println(cliente.getNome());
        }

        System.out.println("programa finalizado");
    }
}
