// Exceção personalizada para divisão por zero
class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("Divisão por zero não é permitida.");
    }
}

// Classe Calculadora
class Calculadora {
    // Método para adição
    public int adicao(int a, int b) {
        return a + b;
    }

    // Método para subtração
    public int subtracao(int a, int b) {
        return a - b;
    }

    // Método para multiplicação
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    // Método para divisão de inteiros
    public int divisaoInteira(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }

    // Método para divisão de floats
    public float divisaoFloat(float a, float b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        try {
            // Exemplo de uso dos métodos da calculadora
            int resultadoSoma = calc.adicao(5, 3);
            int resultadoSubtracao = calc.subtracao(10, 4);
            int resultadoMultiplicacao = calc.multiplicacao(7, 6);
            int resultadoDivisaoInteira = calc.divisaoInteira(15, 3);
            float resultadoDivisaoFloat = calc.divisaoFloat(10.0f, 0.0f); // Tentativa de divisão por zero

            // Exibindo os resultados
            System.out.println("Resultado da soma: " + resultadoSoma);
            System.out.println("Resultado da subtração: " + resultadoSubtracao);
            System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
            System.out.println("Resultado da divisão inteira: " + resultadoDivisaoInteira);
            System.out.println("Resultado da divisão de floats: " + resultadoDivisaoFloat);
        } catch (DivisionByZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
