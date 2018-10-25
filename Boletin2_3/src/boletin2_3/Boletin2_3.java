
package boletin2_3;

import javax.swing.JOptionPane;

public class Boletin2_3 {

    public static void main(String[] args) {
        
        int bil1; //Billetes de 100
        int bil2; //Billetes de 20
        int bil3; //Billetes de 5
        int mon;  //Monedas de 1
                
        bil1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de billetes de 100: "));
        bil2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de billetes de 20: "));
        bil3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de billetes de 5: "));
        mon = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de monedas de 1: "));
               
        JOptionPane.showMessageDialog(null,"El total es: "+(bil1 * 100 + bil2 * 20 + bil3 * 5 + mon)+" euros");
                       
    }
    
}
