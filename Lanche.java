import java.util.Scanner;

public class Lanche {
    public static void main(String [] args){
        float A, B;
        double total;
        Scanner leitor = new Scanner (System.in);
        A = leitor.nextInt();
        B = leitor.nextInt();
        if (A == 1){
            total = (B * 4.00);
            System.out.print("Total: R$ ");
            System.out.print(total);
        }
        else if(A == 2){
            total = (B * 4.50);
            System.out.print("Total: R$ ");
            System.out.print(total);
        }
        else if(A == 3){
            total = (B * 5.00);
            System.out.print("Total: R$ ");
            System.out.print(total);
        }
        else if(A == 4){
            total = (B * 2.00);
            System.out.print("Total: R$ ");
            System.out.print(total);
        }
        else if(A == 5){
            total = (B * 1.50);
            System.out.print("Total: R$ ");
            System.out.print(total);
        }
    }
}
