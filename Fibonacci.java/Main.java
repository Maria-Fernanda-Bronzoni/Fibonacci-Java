import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0, num2 = 1;

        System.out.println("A sequência começa em: " + num1 + ", " + num2);

        while (true) {
            int proximoTermo = num1 + num2;

            System.out.print("Qual é o próximo número na sequência? ");
            int palpite = scanner.nextInt();

            if (palpite == proximoTermo) {
                System.out.println("Correto! A sequência continua: " + proximoTermo);
                num1 = num2;
                num2 = proximoTermo;
            } else {
                System.out.println("Errado! O próximo número na sequência era: " + proximoTermo);
                break;
            }
        }

        scanner.close();
    }
}