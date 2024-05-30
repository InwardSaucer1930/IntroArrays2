/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.introarrays2;

/**
 *
 * @author tamal
 */
public class IntroArrays2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    int[] numeros;
        
        numeros=new int[5];
        
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;
       
        for(int j=0; j<numeros.length; j++){
            System.out.println("Los numeros son: "+j+numeros[j]);
        }
        
        //System.out.println("El elemento de indice 0: "+numeros[0]);
        //System.out.println("El elemento de indice 1: "+numeros[1]);
        //System.out.println("El elemento de indice 2: "+numeros[2]);
        //System.out.println("El elemento de indice 3: "+numeros[3]);
        //System.out.println("El elemento de indice 4: "+numeros[4]);
        
        //int suma= numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4];
        //System.out.println("La suma del array es: "+suma);
        
        int suma=0;
        for (int i=0; i< numeros.length; i++){
            suma+=numeros[i];           
        }

        System.out.println("La suma con ciclo for es: "+suma);


         
        
    
    
    }
}
