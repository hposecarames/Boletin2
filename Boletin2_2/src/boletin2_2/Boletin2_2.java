
package boletin2_2;

import javax.swing.JOptionPane;

public class Boletin2_2 {
    
    public static void main(String[] args) {
        
        double tempC; //Temperatura en grados Celsius
                
        tempC = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en Celsius: "));
                
        JOptionPane.showMessageDialog(null, tempC+" grados Celsius son: "+"\n"+(tempC * 1.8 + 32)+" grados Farenheit"+"\n"+(tempC + 273)+" grados Kelvin");
        
        
        
        
    }
    
}
