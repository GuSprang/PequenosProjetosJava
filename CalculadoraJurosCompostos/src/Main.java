import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double capitalAplicado;
        double taxa;
        int qtdAplicacoes;
        int anos;
        double quantidade;

        System.out.print("Insira o capital da aplicação: ");
        capitalAplicado = ler.nextDouble();
        System.out.print("Insira a taxa em porcentagem: ");
        taxa = ler.nextDouble() / 100;
        System.out.print("Insira a quantidade de aplicações ao ano: ");
        qtdAplicacoes = ler.nextInt();
        System.out.print("Insira o número de anos: ");
        anos = ler.nextInt();

        quantidade = capitalAplicado * Math.pow(1 + taxa /qtdAplicacoes,qtdAplicacoes * anos);

        System.out.printf("A quantidade após %d ano(s) é %.2f", anos, quantidade);

        ler.close();
    }
}
