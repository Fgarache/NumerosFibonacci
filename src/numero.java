import java.util.Scanner;

public class numero {
    public static void main(String[] args) {
        int n1=0,n2=1;
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for (int i = 0; i < numero; numero--) {
            System.out.print("  "+n1);
            n1= n1+n2;
            n2=n1-n2;
        }
    }
}
