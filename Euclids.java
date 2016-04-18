/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author dennis
 */
public class Euclids {
    public static int Nwd(int a,int b){
        int c;
        while(b!=0){
            c=a%b;
            a=b;
            b=c;
        }
        return a;
 }  
    
 public static void main (String [] args){
   System.out.println("The greatest common diviser is" + Nwd(45,75));
 }   
}
