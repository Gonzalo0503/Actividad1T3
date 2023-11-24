/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Random;

/**
 *
 * @author pelfuego
 */
public class Rectangulo {
    public static void main(String[] args) {
        Random r=new Random();
        int base=r.nextInt(1,11);
        int altura=r.nextInt(1,11);
        
        System.out.println("base: " +base);
        System.out.println("altura: " +altura);
        
        for(int i=0;i<altura;i++){
            for(int j=0;j<base;j++){
                System.out.print("*");}
        System.out.println("");}
        
        
        
        
        
    }
}
