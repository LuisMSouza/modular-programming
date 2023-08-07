package revisao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vet = new int[6];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Enter n: ");
            vet[i] = scan.nextInt();
        }
        scan.close();
        
        inverter(vet);
    }

    public static void inverter(int[] vet) {
        int[] vetAux = new int[vet.length];
        int c = 0;

        for (int i = vet.length - 1; i >= 0; i--) {
            vetAux[c] = vet[i];
            c++;
        }
        for (int number : vetAux) {
            System.out.println("N: " + number);
        }
    }
}
