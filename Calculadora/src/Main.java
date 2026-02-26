import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1;
        int num2;
        int resultado = 0;
        String opcao;

        System.out.println("Digite o primeiro numero: ");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = ler.nextInt();
        System.out.println("Digite a operação a ser feita (+,-,x,/): ");
        opcao = ler.next();

        if (opcao.equals("+")) {
            resultado = num1 + num2;
        }else if (opcao.equals("-")) {
            resultado = num1 - num2;
        }else if (opcao.equals("x")){
            resultado = num1 * num2;
        }else if (opcao.equals("/")){
            resultado = num1 / num2;
        }else {
            System.out.println("Opção inválida!");
        }

        System.out.println("O resultado de "+ num1 + "" + opcao + "" + num2 + " é: " + resultado);

        ler.close();
    }
}
