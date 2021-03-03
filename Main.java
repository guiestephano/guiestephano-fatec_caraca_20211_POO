import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int A, B, C, D;
        Scanner leitor = new Scanner (System.in);
        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();
        if (B > C && D > A && C + D > A + B && C >= 0 && D >= 0 && A % 2 == 0){
            System.out.print("Valores aceitos");
        }
        else{
            System.out.print("Valores não aceitos");
        }
    }

}
