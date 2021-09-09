package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private List<Cliente> clientes = new ArrayList<>();

    public void adiciona(Cliente cliente) throws ClienteExistenteException, MenorIdadeException{
        if(clienteCadastrado(cliente)) {
            throw new ClienteExistenteException("cliente já cadastrado.");
        }
        if(!maiorIdade(cliente)) {
            throw new MenorIdadeException("cliente menor de idade.");
        }
        clientes.add(cliente);
    }


    private boolean clienteCadastrado(Cliente cliente) {
        return clientes.contains(cliente);
    }

    private boolean maiorIdade(Cliente cliente) {
        long qtdeAnos = ChronoUnit.YEARS.between(cliente.getDataNascimento(), LocalDate.now());
        return (qtdeAnos >= 18);
    }

    public List<Cliente> listagem(){
        return clientes;
    }
}
