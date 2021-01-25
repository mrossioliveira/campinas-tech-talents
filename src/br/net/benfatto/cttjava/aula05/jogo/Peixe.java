package br.net.benfatto.cttjava.aula05.jogo;

/**
 * @author Murilo Oliveira
 */
public class Peixe extends Animal {
    private AnimalNadador nadador;

    public void setNadador(AnimalNadador nadador) {
        this.nadador = nadador;
    }

    public AnimalNadador getNadador() {
        return nadador;
    }
}
