
package boletin2_4;

import javax.swing.JOptionPane;

public class Boletin2_4 {

    
    public static void main(String[] args) {
    
        int cantidad, mon, resto1, resto2;     
                              
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad: "));
        
        resto1 = cantidad % 100;        
        resto2 = resto1 % 20;        
        mon = resto2 % 5;
        
        JOptionPane.showMessageDialog(null,cantidad+" euros son: "+"\n"+(cantidad / 100)+" billetes de 100"+"\n"+(resto1 / 20)+" billetes de 20"+"\n"+(resto2 / 5)+" billetes de 5"+"\n"+mon+" monedas de 1");
        
        
    }
    
}
