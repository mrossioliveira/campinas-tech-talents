package br.net.benfatto.cttjava.aula07.primitivos;

/**
 * @author Murilo Oliveira
 */
public class Calculadora {
    // soma - retorne a soma de dois numeros inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // subtracao  - retorne a subtracao de dois numeros inteiros
    public int subtrair(int a, int b) {
        return a - b;
    }

    // multiplicacao - retorne a multiplicacao de dois numeros inteiros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // divisao - retorne a divisao de dois numeros **
    public double dividir(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("Não é possível fazer divisão por 0.");
        }
        return a / b;
    }

    // verifica se um numero e par - retorna true se for par, e false se nao for
    public boolean ePar(int n) {
        return (n % 2) == 0;

//        if (n % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
