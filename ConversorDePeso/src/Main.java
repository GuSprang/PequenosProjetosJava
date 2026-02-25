import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double peso;
        double pesoConvertido;
        int escolha;

        System.out.println("Programa de conversão de peso" +
                "\n Selecione uma opção (Números apenas): " +
                "\n 1 - Converter Quilos para Libras " +
                "\n 2 - Converter Libras para Quilos");

        escolha = ler.nextInt();


        if  (escolha == 1){
            System.out.println("Digite o peso em quilos para converter em libras: ");

            peso = ler.nextDouble();
            pesoConvertido = peso * 2.2046;
            System.out.println("O peso " + peso + " em libras é: " + pesoConvertido);
        } else if  (escolha == 2){
            System.out.println("Digite o peso em libras para converter em quilos: ");

            peso = ler.nextDouble();
            pesoConvertido = peso / 2.2046;
            System.out.println("O peso " + peso + " em quilos é: " + pesoConvertido);

        }else {
            System.out.println("Opção inválida.");

        }

        ler.close();
    }
}
