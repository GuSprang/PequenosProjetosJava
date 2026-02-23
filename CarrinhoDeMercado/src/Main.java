import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String item;
        double valor;
        int quantidade;
        String moeda = "R$";
        double total;

        System.out.print("Que item você gostaria de comprar?: ");
        item = ler.nextLine();
        System.out.print("Qual é o preço de cada " + item+ "?: ");
        valor = ler.nextDouble();
        System.out.print("Quantos do item " +item + " você deseja?: ");
        quantidade = ler.nextInt();

        total = valor * quantidade;

        System.out.println("O preço total de " + quantidade +" "+ item+ " é "+moeda +total+".");


        ler.close();
    }
}
