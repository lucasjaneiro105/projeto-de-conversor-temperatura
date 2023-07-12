import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
     
	 Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     
     char r;
     do {
    	 System.out.print("Qual a temperatura em celsius: ");
         double c = sc.nextDouble();
         double f = (c * 9/5) + 32;
         System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
         System.out.print("Deseja repetir (s/n)? ");
         r = sc.next().charAt(0);
    	 } while (r != 'n');
     
     
     sc.close();

	}

}
