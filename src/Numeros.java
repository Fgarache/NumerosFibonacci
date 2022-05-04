import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int num1=0, num2=1;

        Scanner sc = new Scanner(System.in);
        int ciclo = sc.nextInt();
        for (int i = 0; i < ciclo; i++) {
            System.out.printf(" "+num1);
            num1= num1+num2;
            num2=num1-num2;
        }
    }
}
