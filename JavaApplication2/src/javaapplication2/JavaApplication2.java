/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Ruturaj
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n;  
            System.out.println("Enter the number till you want a star pattern");  
           Scanner scan = new Scanner(System.in);  
            n = scan.nextInt();  
    
            label:     for(int i=0; i<n; i++)  
                 {  
                     System.out.print("i"+i);
                      for(int k=i; k>0; k--)  
                      {  
                          System.out.print("k"+k);
                           System.out.print(" ");  
                      }  
                      for(int j=0; j<n-i; j++)  
                      {  
                          System.out.print("j"+j);
                           System.out.print("*");  
                      }  
                      //for jump to next line  
                      System.out.println("");  
                 } 
    
    }
    
}
