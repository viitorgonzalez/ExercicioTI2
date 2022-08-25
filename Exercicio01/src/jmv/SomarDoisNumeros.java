package jmv;
import java.util.Scanner;

class ex1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de b: ");
        int b = scanner.nextInt();

        int soma = a + b;

        System.out.println("A soma é: " + soma); //System.out.println("A soma é: " + (a + b));

    }
}
