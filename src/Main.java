import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Harmonik hesabı kaçıncı sayıya kadar olacak :");
        int listElemanSayısı = scan.nextInt();
        double[] list = new double[listElemanSayısı];
        double harmonic = 0.0;
        double count = 0;
        for (int i = 0; i < listElemanSayısı; i++) {
            list[i] = count + 1;
            count = list[i];
            harmonic+= 1 / list[i];





          }System.out.println(harmonic);

    }
}