/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oyun1;

import java.util.Scanner;

/**
 *
 * @author MSi
 */
public class Oyun1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner choose= new Scanner(System.in);
        Heroes hero1=new Heroes();
        System.out.println("!! YOU ARE WELCOME TO MY GAME !!");
        System.out.println("!! PLS CHOOSE YOUR HERO !!");
        System.out.println("1-KNİGT\n2-ARCHER\n3-MAGE");
        int takeNumber=choose.nextInt();
        hero1.heroPick(takeNumber);
        System.out.println("CHOOSE OPTİONS");
        System.out.println("Menü:\n 1-Stats\n 2-Item\n 3-Your Orders\n");
        takeNumber=choose.nextInt();
        if(takeNumber==1) hero1.stat();
        if(takeNumber==2) hero1.ıtem();
        if(takeNumber==3) hero1.order();
    }
}
    
