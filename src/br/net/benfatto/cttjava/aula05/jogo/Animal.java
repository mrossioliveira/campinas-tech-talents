package br.net.benfatto.cttjava.aula05.jogo;

/**
 * @author Murilo Oliveira
 */
public class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void comer() {
        System.out.println("Comendo");
    }

    public void dormir() {
        System.out.println("Dormindo");
    }
}
