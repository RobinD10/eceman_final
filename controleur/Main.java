/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;


import vue.Plateau;

import java.io.*;
import static controleur.Play.*;


public class Main {

   public static void main(String[] args) throws IOException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plateau().setVisible(true);
            }
        });
      //  Graphics home = new Graphics();
       int userSelected;
        do {
            userSelected = MenuData();
            switch (userSelected) {
                case 1:
                    System.out.println("Voici les règles du jeu :");
                    System.out.println("##########################");
                    break;
                case 2:
                    playGame(false, null);
                    break;
                case 3:
                    chooseTextFile();
                    break;
                case 4:
                    System.out.println("QUITTER");
                    System.exit(0);
                    break;
            }
        }
        while (userSelected > 4);
      //  home.setVisible(true);
    }
    
    /*public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plateau().setVisible(true);
            }
        });
    }*/

}