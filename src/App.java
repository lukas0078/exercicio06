import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 07/04/2023 */

public class App {

    public static void main(String[] args) {
        double raio;
        double area;
        final double PI = 3.1416;

       System.out.println("Escreva o valor do raio");
       Scanner scan = new Scanner(System.in);
       raio = scan.nextFloat();
       area = scan.nextFloat();


       area  = PI* (raio*raio);

       System.out.print("O valor da area é " + area);  
       System.out.print(area);
       scan.close();
    }

    }