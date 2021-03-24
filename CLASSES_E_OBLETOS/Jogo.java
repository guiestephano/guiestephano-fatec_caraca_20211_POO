import java.util.Random;
public class Jogo {
    public static void main(String... args) 
                                throws InterruptedException {
      Personagem fominha = new Personagem("Irineu");
      fominha.setFome(10);
      Random gerador = new Random();

      while (true){
          double oQueFazer = gerador.nextDouble();

          if (oQueFazer <= 0.6){
              fominha.comer();
          }
          else if(oQueFazer <= 0.7){
              fominha.dormir();
          }
          else{
              fominha.cacar();
          }
          fominha.exibir();
        //System.out.printf("%s: e(%d),f(%d),s(%d)\n", soneca.getNome(), soneca.getEnergia(), soneca.getFome(), soneca.getSono());
        
        Thread.sleep(10000);
      }
    }
}