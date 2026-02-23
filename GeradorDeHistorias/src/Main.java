import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String adjetivo1;
        String adjetivo2;
        String adjetivo3;
        String pronome1;
        String verbo1;

        System.out.print("Adicione um adjetivo: ");
        adjetivo1 = ler.nextLine();
        System.out.print("Adicione um pronome: ");
        pronome1 = ler.nextLine();
        System.out.print("Adicione um adjetivo: ");
        adjetivo2 = ler.nextLine();
        System.out.print("Adicione um verbo no presente: ");
        verbo1 = ler.nextLine();
        System.out.print("Adicione um adjetivo: ");
        adjetivo3 = ler.nextLine();

        System.out.println("Hoje eu fui em um zoológico " + adjetivo1 + ".");
        System.out.println("Em uma das jaulas eu vi um "+ pronome1 + ".");
        System.out.println(pronome1 + " era " + adjetivo2 + " e estava " + verbo1 + "!");
        System.out.println("Eu fiquei " +adjetivo3 + "!");

        ler.close();


    }
}
