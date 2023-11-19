import java.util.Scanner;

public class  Calculadora {
    private float num1;
    private float num2;

    Calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public float somar(){
        
        return num1 + num2;
    }
    public float multiplicar(){

        return num1 * num2;
    }
    public float subtrair(){

        return num1 - num2;
    }
    public float dividir(){
        return num1 / num2;
    }
    public void menu(){

        System.out.println("Selecione uma opção");
        System.out.println("1 - Somar");
        System.out.println("2 - Multiplicar");
        System.out.println("3 - Subtrair");
        System.out.println("4 - Dividir");
        System.out.println("Opção: ");
    }
    public void resultado(float result){

        System.out.println("O resultado é: " + result);
    }
    public static void main(String[] args) throws Exception {
        float num1, num2;
        int op;
        Scanner entrada = new Scanner(System.in);
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        Calculadora calc = new Calculadora(num1, num2);
        calc.menu();
        op = entrada.nextInt();
        entrada.close();
        switch (op) {
            case 1:
                
                calc.resultado(calc.somar());
                break;
            case 2 :
                calc.resultado(calc.multiplicar());
                break;
            case 3 :
                calc.resultado(calc.subtrair());
                break;
            case 4 :
                calc.resultado(calc.dividir());
            default:
                break;
        }
    }
    
}
