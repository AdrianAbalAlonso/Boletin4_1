/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrián
 */
public class Cantidad {
    float num;
    public float pedirCantidad(){
        this.num=num;
    return Float.parseFloat(JOptionPane.showInputDialog("Introducir cantidad : "));
    }
    public static void operarNumeros(float num){
    if(num<500){
        JOptionPane.showMessageDialog(null,"Cantidad inicial :"+num);
        JOptionPane.showMessageDialog(null,"Cantidad  incremento : "+50+" %");
        JOptionPane.showMessageDialog(null,"Cantidad final : "+num+(num*0.5));
    }
        else if(num>=500&&num<=1000){
            JOptionPane.showMessageDialog(null,"Cantidad inicial : "+num);
            JOptionPane.showMessageDialog(null,"Cantidad de incremento "+7+ " %");
            JOptionPane.showMessageDialog(null,"Cantidad final : "+num+(num*0.07));
           
        }
        else if (num>=1000&&num<=5000){
            JOptionPane.showMessageDialog(null,"Cantidad inicial : "+num);
            JOptionPane.showMessageDialog(null,"Cantidad de incremento : "+0.15+" %");
            JOptionPane.showMessageDialog(null,"Cantidad final : "+num+(num*0.15));
        }
        else if(num>=5000){
            JOptionPane.showMessageDialog(null,"Cantidad inicial : "+num);
            JOptionPane.showMessageDialog(null,"Cantidad de incremento: "+ (-0.03)+"%");
            JOptionPane.showMessageDialog(null,"Cantidad final : "+(num-(num*0.03)));
        }
    }
}
