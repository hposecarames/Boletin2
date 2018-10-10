
package boletin2_1;

import javax.swing.JOptionPane;

public class Boletin2_1 {

    
    public static void main(String[] args) {
        
        double precioTarifa;
        double precioPagado;
        
        precioTarifa = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de tarifa: "));
        precioPagado = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad pagada: "));
                
        JOptionPane.showMessageDialog(null,"El porcentaje de descuento es: "+(100-(precioPagado * 100 / precioTarifa))+"%");
        
    }
    
}
