public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        for (int i = 1; i < 5; i++) {
            System.out.println(""+main.num(i));
        }
        System.out.printf(" "+ main.num(12));

    }
    public int num (int num1) {
        if (num1 == 1 || num1==2) {
            return 1;
        }else {
            return num(num1-1)+num(num1-2);
        }
    }



    int fibonacci(int n)
    {
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
        }
        else if (n==1) {  // caso base
            return 1;
        }
        else if (n==0){  // caso base
            return 0;
        }
        else{ //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

}



