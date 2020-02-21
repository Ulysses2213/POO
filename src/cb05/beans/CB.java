/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb05.beans;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author madri
 */
public class CB extends EntradaSalidaBeans{
    EntradaSalidaBeans datos = new EntradaSalidaBeans();
    
    private int b1 = 0, b2 = 0;
    private String num = "";
    
    public CB(int b1, int b2, String num)
    {
        this.b1 = b1;
        this.b2 = b2;
        this.num = num;
    }
    
    private double CB1B10()
    {
        double resultado = 0.0;

        if(num.contains(".")) 
        {
            String decimales = num.substring(num.indexOf(".") + 1);
            num = num.substring(0, num.indexOf("."));

            int n = -1;

            for(int i = 0; i < decimales.length(); ++i) 
            {
                    if(Character.isDigit(decimales.charAt(i)))
                            resultado += (Character.codePointAt(decimales, i) - 48) * Math.pow(b1, n);
                    else
                            resultado += (Character.getNumericValue(decimales.charAt(i))) * Math.pow(b1,n);
                    n--;
            }

            resultado += Integer.parseInt(num, b1);
        }
        else 
            resultado += Double.valueOf(Integer.parseInt(num, b1));
        
        return resultado;
    }
    
    public String B1B2()
    {
        double valor = CB1B10();
        String decimales = "";
        String numero = Double.toString(valor);
        //Base A convertir
        StringBuilder resultado = new StringBuilder("");

        if(numero.contains(".")) 
        {
            decimales = numero.substring(numero.indexOf(".") + 1);
            numero = numero.substring(0, numero.indexOf("."));

            resultado.append(Integer.toString(Integer.parseInt(numero), b2).toUpperCase());

            StringBuilder decimal = new StringBuilder("0.");
            decimal.append(decimales);

            double res = Double.valueOf(decimal.toString());

            resultado.append(".");

            for(int i = 0; i < decimales.length() + 1; ++i) 
            {
                res = res * b2;
                int entero = (int) res;
                resultado.append(Integer.toString(entero, b2).toUpperCase());
                res %= 1;
            }
        }
        else 
            resultado.append(Integer.toString(Integer.parseInt(numero), b2).toUpperCase());       
        
        return resultado.toString().toUpperCase();
    }
}
