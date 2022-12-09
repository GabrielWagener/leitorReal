import java.io.IOException;
import java.util.Scanner;
import java.text.NumberFormat;


public class Main {
    public static void main(String args[]) {
        Scanner le = new Scanner(System.in);
        System.out.println("Digite um número real");
        double real = Double.parseDouble(le.nextLine());
        System.out.println("O número digitado é: " + real);
        System.out.println("5% do número é: " +  real * 5 /100);
        System.out.println("50% do número é: " +  real * 50 /100);
        System.out.println("150% do número é: " + real * 150 /100);
 }
}