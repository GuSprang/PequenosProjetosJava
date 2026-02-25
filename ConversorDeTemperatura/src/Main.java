import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double temp ;
        double tempConvertida;
        int escolha;

        System.out.println("Programa de conversão de temperatura" +
                "\n Selecione uma opção (Números apenas): " +
                "\n 1 - Converter Fahrenheit para Celsius " +
                "\n 2 - Converter Celcius para Fahrenheit");

        escolha = ler.nextInt();


        if  (escolha == 1){
            System.out.println("Digite a temperatura em Fahrenheit para converter em Celcius: ");

            temp = ler.nextDouble();
            tempConvertida = ((temp - 32) / 1.8);
            System.out.println("A temperatura " + temp + " em Celcius é: " + tempConvertida);
        } else if  (escolha == 2){
            System.out.println("Digite o peso em libras para converter em quilos: ");

            temp = ler.nextDouble();
            tempConvertida = ((temp * 1.8) + 32 );
            System.out.println("A temperatura " + temp + " em Fahrenheit é: " + tempConvertida);

        }else {
            System.out.println("Opção inválida.");

        }

        ler.close();
    }
}
