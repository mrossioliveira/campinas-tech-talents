package br.net.benfatto.cttjava.aula04.model;

/**
 * @author Murilo Oliveira
 */
public class Aluno {
    private String nome;
    private String email;
    private int RA;

    public void setNome(String nome) {
        int a = 0;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }
}
