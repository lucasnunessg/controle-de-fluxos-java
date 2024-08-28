import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       String hello = "Olá!";
       System.out.println("Diga olá: ");
       String input = scanner.next();

       scanner.close();

       if (hello == input) {
           System.out.println("isso não será impresso!");
       }
       if (hello != input) {
           System.out.println("Isso será impresso!");
       }
       if (hello == hello) {
           System.out.println("Isso também será impresso, é o mesmo objeto.");
       }
       if (hello.equals(input)) {
           System.out.println("Isso vai ser impresso se for digitado 'olá'.");
       }
    }
}
