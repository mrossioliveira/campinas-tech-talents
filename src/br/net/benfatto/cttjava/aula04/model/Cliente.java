package br.net.benfatto.cttjava.aula04.model;

/**
 * @author Murilo Oliveira
 */
public class Cliente {
    private String nome;
    private String telefone;
    // private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
