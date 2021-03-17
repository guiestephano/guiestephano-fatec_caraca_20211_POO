import java.util.Scanner;
public class Tabuada{
    public static void main(String[] args){
        int n, count;
        Scanner leitor = new Scanner (System.in);
        n = leitor.nextInt();
        count = 1;
        while (count <= 10){
            System.out.println(count + " X " + n + " = " + (n*count));
            count += 1;
        }

    }
}