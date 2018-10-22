
package boletin2_5;

import javax.swing.JOptionPane;

public class Boletin2_5 {

    
    public static void main(String[] args) {
        
        double soldo, ventas, kms, dietas, soldoBruto, irpf, ssocial;
        
        soldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo: "));
        ventas = Double.parseDouble(JOptionPane.showInputDialog("Introduce las ventas: "));
        kms = Double.parseDouble(JOptionPane.showInputDialog("Introduce los kms: "));
        dietas = Double.parseDouble(JOptionPane.showInputDialog("Introduce los días: "));
        soldoBruto = soldo+(ventas*0.05)+(kms*2)+(dietas*30);
        irpf = soldoBruto * 0.18;
        ssocial = 36;
        JOptionPane.showMessageDialog(null, "El sueldo bruto es: "+ soldoBruto +"\nEl sueldo liquido es: "+(soldoBruto-irpf-ssocial));
        
        
      
        
        
        
        
        
        
        
    }
    
}
