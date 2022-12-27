/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplos;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 1er proyecto Danny y Amix
 */
public class Multiplos {
    public static void main(String[] args) 
    {   
        ArrayList<Integer> primosLista= new ArrayList();
        int num, den, lim=110000;
        boolean primo;
       
        for (num=2; num<=lim; num++){
                primo=true;
            for (den=num-1; den>1; den--)
            {
                if (num%den==0)
                {
                    primo=false;
                }
            }
           if(primo)
           {
            primosLista.add(num);
           }
        }
        //System.out.println("La cantidad de números primos es:" + primosLista);
        System.out.println("La cantidad de números primos es:" + primosLista.size());
        System.out.println("El 10001ro primo de la lista es el " + primosLista.get(10000));
    }
}