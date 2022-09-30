import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        A = sc.nextInt(10);
        B = sc.nextInt(15);

        soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}