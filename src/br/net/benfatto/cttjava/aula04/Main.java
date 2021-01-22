package br.net.benfatto.cttjava.aula04;

import br.net.benfatto.cttjava.aula04.model.Aluno;
import br.net.benfatto.cttjava.aula04.model.Carro;
import br.net.benfatto.cttjava.aula04.model.Cliente;

import java.util.Scanner;

/**
 * Aula 04
 * - Exercício!
 * - Herança - "É um"
 * - Composição - "Tem um"
 * - Polimorfismo
 * - Interfaces
 * - Classe Abstrata
 * - Herança vs Composição
 */

/**
 * @author Murilo Oliveira
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setPlaca("ABC-1234");
        carro.setCor("Preto");
        carro.setMarca("Ferrari");

        Cliente clienteJogador = new Cliente();
        clienteJogador.setNome("Deyverson");
        clienteJogador.setTelefone("987983475");

        carro.setCliente(clienteJogador);

        Cliente cliente = carro.getCliente();

        System.out.println(carro.getPlaca());
        System.out.println(carro.getMarca());
//        System.out.println(carro.getCliente().getNome());
        System.out.println(cliente.getNome());


    }
}
