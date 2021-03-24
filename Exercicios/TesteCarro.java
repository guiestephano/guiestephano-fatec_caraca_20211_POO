import javax.swing.JOptionPane;

public class TesteCarro{
    public static void main(String [] args){
        String color = JOptionPane.showInputDialog(null, "Digite a cor do carro1: ");
        boolean porta = JOptionPane.showInputDialog(null,"A porta esta fechada?(true ou false): ") != null;
        Carro c1 = new Carro(color, porta);
        System.out.println("Carro 1");
        c1.setcor(color);
        c1.setportaFechada(porta);
        c1.exibirExpecificacoes();
        color = JOptionPane.showInputDialog(null, "Digite a cor do carro2: ");
        porta = JOptionPane.showInputDialog(null,"A porta esta fechada?(true ou false): ") != null;
        System.out.println("Carro 2");
        Carro c2 = new Carro(color, porta);
        c2.setcor(color);
        c2.setportaFechada(porta);
        c2.exibirExpecificacoes();
        Carro c3 = new Carro("Azul",true);
        System.out.println("Carro 3");
        c3.exibirExpecificacoes();
    }
}