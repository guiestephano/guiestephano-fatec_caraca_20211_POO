public class Carro{
    private String cor;
    private boolean portaFechada;
    public Carro(String c, boolean p){
        setcor(c);
        setportaFechada(p);
    }
    public void setportaFechada(boolean porta){
        portaFechada = porta;
    }
    public boolean getportaFechada(){
        return portaFechada;
    }
    public void setcor(String c){
        cor = c;
    }
    public String getcor(){
        return cor;
    }
    public void exibirExpecificacoes(){
        System.out.println(String.format("Cor: %s", getcor()));
        if(getportaFechada() == true){
            System.out.println("Porta: fechada");
        }
        else{
            System.out.println("Porta: Aberta");
        }
    }
    public void entraNoCarro(){
        if(portaFechada == true){
            System.out.println("Porta fechada");
            System.out.println("Abra a porta para entrar");
        }
        else{
            System.out.println("Você entrou no carro");
        }
    }
    void abrirPorta(){
        System.out.println("Voce abriu a porta");
        portaFechada = false;
    }
}