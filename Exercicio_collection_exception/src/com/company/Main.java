package com.company;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ClienteService clienteService = new ClienteService();

        while(true) {
            System.out.println("\n Digite o nome do cliente:");
            String nome = teclado.nextLine();
            System.out.println("\n Digite a data de nascimento do cliente:");
            String dataNascent = teclado.nextLine();

            if(nome.equalsIgnoreCase("exit") || dataNascent.equalsIgnoreCase("exit")) {
                teclado.close();
                System.exit(0);
            }
            try {
                Cliente cliente = new Cliente(nome, LocalDate.parse(dataNascent));
                clienteService.adiciona(cliente);
                System.out.println("O cadastro do cliente foi realizado com sucesso!\n");
            }catch(MenorIdadeException | ClienteExistenteException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
    }
}
