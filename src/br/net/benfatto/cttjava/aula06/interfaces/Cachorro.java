package br.net.benfatto.cttjava.aula06.interfaces;

/**
 * @author Murilo Oliveira
 */
public class Cachorro extends Animal {
    private IAnimalAndador andador;

    public Cachorro(IAnimalAndador andador) {
        this.andador = andador;
    }

    public IAnimalAndador getAndador() {
        return andador;
    }
}
