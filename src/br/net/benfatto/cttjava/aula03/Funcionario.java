package br.net.benfatto.cttjava.aula03;

/**
 * @author Murilo Oliveira
 */
public class Funcionario {
    private int codigo;
    private String nome;

    public void setCodigo(int codigoRecebido) throws Exception {

        if (codigoRecebido == 0) {
            // erro
            throw new Exception("Código não pode ser zero.");
        }

        this.codigo = codigoRecebido;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
