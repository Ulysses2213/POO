/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb05.control;
import cb05.EntradaSalida;
import cb05.beans.EntradaSalidaBeans;
import javax.swing.JOptionPane;
/**
 *
 * @author gem2u
 */
public class EntradaSalidaControl {
     
    public void validacionCampos(int b1, int b2, String numero){
        if(b1 == b2 && b1 != 0 && b2 !=0){
            JOptionPane.showMessageDialog(null, "Las bases son iguales, debe elegir otras.");
        }else{
            if(b1 == 0 || b2 == 0){
                JOptionPane.showMessageDialog(null, "Debe elegir alguna base.");
            }else{
                if(numero.isEmpty() && (b1 != 0 || b2 != 0)){
                    JOptionPane.showMessageDialog(null, "Debe llenar el campo del numero.");
                }
            }     
        }
    }
    
    public void validacionNumero(char validacion, int b1, java.awt.event.KeyEvent evt){
        char validar = evt.getKeyChar();
        b1 -=1;
        char num = Integer.toString(b1).charAt(0);
        if(Character.isDigit(validar)){
            if(validar > num){
                JOptionPane.showMessageDialog(null, "Debe ingresar numeros validos");
            }
        }
        
    }
}
