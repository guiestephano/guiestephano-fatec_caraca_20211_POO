public class Personagem{
    private String nome;
    private int energia = 10;
    private int fome;
    private int sono;
    
    Personagem(String nome){
        this.nome = nome;
    }
    public void setFome(int fome) {
        if(fome >=0 && fome <=10)
        this.fome = fome;
    }

    public void setSono(int sono) {
        if(sono >= 0 && sono <= 10)
        this.sono = sono;

    }

    public int getEnergia() {
        return energia;
    }
    
    public int getFome() {
        return fome;
    }

    public String getNome() {
        return nome;
    }

    public int getSono() {
        return sono;
    }

    void exibir(){
        System.out.printf("%s: e(%d),f(%d),s(%d)\n", this.getNome(), this.getEnergia(), this.getFome(), this.getSono());
        System.out.println("================================");
    }

    void cacar(){
        if(energia >= 2){
            System.out.println(String.format("%s cacando", nome));
        }
        else{
            System.out.println(nome +" Sem energia para caçar");
        }
        fome = Math.min(fome+1, 10);
        fome = Math.min(fome+1,10);
        energia -= 2;
    }

    void comer(){
        if(fome >= 1){
            System.out.printf("%s comendo\n", nome);
            energia = Math.min(energia +1, 10);
            fome = Math.max(fome-1, 0);
        }
        else{
            System.out.println(nome+ " sem fome");
        }
    }


    void dormir(){
        if (sono >= 1){
            System.out.println(nome + " dormindo");
            sono -= 1;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
        else{
            System.out.println(nome + " sem sono");
        }
    }
}