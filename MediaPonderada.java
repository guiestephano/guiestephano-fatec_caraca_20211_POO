import java.util.Scanner;
public class MediaPonderada {
    public static void main(String[] args){
        Double n, média;
        Double n1, n2, n3;
        Scanner leitor = new Scanner(System.in);
        n = (double) leitor.nextInt();
        while(n >= 1){
            n1 = leitor.nextDouble();
            n2 = leitor.nextDouble();
            n3 = leitor.nextDouble();
            média = (n1*2.0+ n2*3.0+ n3*5.0)/10.0;
            System.out.println(média);
            n -= 1;
        }
    }
}
