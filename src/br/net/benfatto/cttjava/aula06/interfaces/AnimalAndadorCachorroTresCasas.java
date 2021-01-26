package br.net.benfatto.cttjava.aula06.interfaces;

/**
 * @author Murilo Oliveira
 */
public class AnimalAndadorCachorroTresCasas extends Animal implements IAnimalAndador, IAnimal {
    @Override
    public void andar() {
        System.out.println("Cachorro andando com três casas");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo apos andar três casas");
    }
}
