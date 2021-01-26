package br.net.benfatto.cttjava.aula06.interfaces;

/**
 * @author Murilo Oliveira
 */
public class AnimalAndadorCachorroCincoCasas implements IAnimalAndador {
    @Override
    public void andar() {
        System.out.println("Cachorro andando cinco casas");
    }
}
