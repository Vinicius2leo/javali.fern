import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        int r;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println(" escolha {1}: otima escolha, escolha {2}: solicite o valor do produto,escolha {3}: falar com a atendente");

            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("otima escolha");
                    break;
                case 2:
                    System.out.println("o valor da blusa é R$200,00");
                    break;
                case 3:
                    System.out.println("falar com a atendente");
                    break;
                default:
                    System.out.println("invalido");
                    break;
            }
            System.out.println("para repetir,digite 0");
            r = sc.nextInt();
        } while (r == 0);


    }
