/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Calculos {
    int numero;
    /**
     *
     * @return
     */
    public int generar(){
    numero = (int) Math.floor(Math.random()*100)+1;
    return numero;
    }
    public int comprobar(int numintro){
        if (numero==numintro)
                return 0;
        else
            if (numero>numintro)
                return 1;
                    else
                return 2;
    }
}
