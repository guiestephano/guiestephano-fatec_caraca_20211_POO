import java.util.Scanner;
//Exercicio 01
public class CoordenadaPonto {
    public static void main(String [] args){
        float X, Y;
        Scanner coordenada = new Scanner (System.in);
        X = coordenada.nextFloat();
        Y = coordenada.nextFloat();
        if(X > 0 && Y > 0){
            System.out.println("Q1");
        }
        else if(X < 0 && Y > 0){
            System.out.println("Q2");
        }
        else if (X < 0 && Y < 0){
            System.out.println("Q3");
        }
        else if (X > 0 && Y < 0){
            System.out.println("Q4");
        }
        else if (X == 0 && Y == 0){
            System.out.println("Origem");
        }
    }
}
