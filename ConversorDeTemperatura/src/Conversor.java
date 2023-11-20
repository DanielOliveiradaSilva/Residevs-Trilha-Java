import java.util.Scanner;

public class Conversor {
    private Double Celsius;
    private Double Fahrenheit;
    private Double Temperatura;

    public Conversor(Double temperatura) {
        this.Temperatura = temperatura;
    }

    public void converterParaFahrenheit() {
        //suponha que a temperatura está em Celsius
        this.Fahrenheit = (this.Temperatura * 9 / 5) + 32;
       
    }

    public void converterParaCelsius() {
        //suponha que a temperatura está em Fahrenheit
       
            this.Celsius = (this.Temperatura - 32) * 5 / 9;
        
    }

    public void mostrarMenu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Converter para Celsius");
        System.out.println("2 - Converter para Fahrenheit");
        System.out.print("Opção: ");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a temperatura:");
        Double temp = teclado.nextDouble();

        Conversor conversor = new Conversor(temp);
        conversor.mostrarMenu();

        int op = teclado.nextInt();
        if (op == 1) {
            conversor.converterParaCelsius();
            System.out.println("Temperatura em Celsius: " + conversor.Celsius + "°C");
        } else if (op == 2) {
            conversor.converterParaFahrenheit();
            System.out.println("Temperatura em Fahrenheit: " + conversor.Fahrenheit + "°F");
        } else {
            System.out.println("Opção inválida!");
        }

        teclado.close();
    }
}
