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
    public static void main(String[] args) {
        List<Integer> multiplos = new ArrayList();
        int num1=3, num2=5, numi, sum=0, max=1000;
        
        for(numi=1; numi<max; numi++)
        {
            if ((numi%num1==0) || numi%num2==0){
            //System.out.println("el numero " + numi + " es primo de 3");
            sum += numi;
            multiplos.add(numi);        
         }
        else{
            System.out.println("El numero " + numi + " no es primo de 3");
            }
        }
         System.out.println("Los números multiplos son " + multiplos);
         System.out.println("El resultado es "+ sum);
         System.out.println("Sistema editado v2");
         
         System.out.println("Agregando comentario en rama modify");
    }
}