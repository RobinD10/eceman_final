/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import modele.Map;
import modele.Perso;
import modele.ChargerMap;

import java.io.*;
import java.util.Scanner;

import static controleur.Enregistrement.readTextFile;

public class Play {
    static Perso player = new Perso(0, 0);
    public static int lvlnumber = 1;
    static controleur.CountTime timer = new controleur.CountTime();

    static void chooseTextFile() {
        System.out.println("Sauvegardes disponibles:");
        File f = new File("src/TextFile/");
        for (String pathname : f.list()) {
            System.out.println("- "+pathname.split("\\.")[0]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("choisir une sauvegarde: ");
        String save = sc.nextLine();
        readTextFile(save);
    }

    public static void startMenu() throws IOException {
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
    }

    public static int MenuData() {
        int selection = 0;

            Scanner sc = new Scanner(System.in);
            System.out.println("Choisissez une option :");
            System.out.println(" 1 - Regles du jeu ");
            System.out.println(" 2 - Jouer ");
            System.out.println(" 3 - Recharger une partie");
            System.out.println(" 4 - Quitter ");

            System.out.println("Vous avez choisis de :");
            selection = sc.nextInt();
        return selection;


    }


    public static void playGame(boolean isSavedLevel, Map savedMap) throws IOException {
        Map mapLvl1 = new Map(ChargerMap.mapLVL1);
        Map mapLvl2 = new Map(ChargerMap.mapLVL2);
        Map mapLvl3 = new Map(ChargerMap.mapLVL3);
        Map mapLvl4 = new Map(ChargerMap.mapLVL4);
        Map mapLvl5 = new Map(ChargerMap.mapLVL5);


        while (lvlnumber <= 5) {

            if(isSavedLevel) {
                isSavedLevel = false;
                System.out.println("LEVEL "+ lvlnumber);
                PlayLevel(player,savedMap);
                System.out.println("-------------------------------- 5 - QUITTER & SAUVEGARDER");
            }

            switch(lvlnumber){
                case 1:
                    System.out.println("LEVEL 1 ");
                    PlayLevel(player,mapLvl1);
                    System.out.println("-------------------------------- 5 - QUITTER & SAUVEGARDER");

                    break;
                case 2:
                    System.out.println("LEVEL 2 ");
                    PlayLevel(player,mapLvl2);
                    System.out.println("-------------------------------- 5 - QUITTER & SAUVEGARDER");

                    break;
                case 3:
                    System.out.println("LEVEL 3 ");
                    PlayLevel(player,mapLvl3);
                    System.out.println("-------------------------------- 5 - QUITTER & SAUVEGARDER");

                    break;
                case 4:
                    System.out.println("LEVEL 4");
                    PlayLevel(player,mapLvl4);
                    System.out.println("-------------------------------- 5 - QUITTER & SAUVEGARDER");
                    break;
                case 5:
                    System.out.println("LEVEL 5");
                    PlayLevel(player,mapLvl5);
                    System.out.println("-------------------------------- 5 - QUITTER & SAUVEGARDER");

                    break;
            }
        }
    }

    private static void PlayLevel(Perso player, Map map) throws IOException {

        Level lvl = new Level(map, player);

        /*Scanner sc = new Scanner(System.in);
        try {

            while (!lvl.isOver() && !lvl.isDone()) {
                Affichage.afficher(map, player);
                System.out.println("Lifes = " + player.getLife() + " Waist time : " + timer.secondPassed);
                System.out.println("Enter choice : ");
                char choice = sc.nextLine().charAt(0);


                if (choice == '5') {
                    System.out.print("entrez votre nom: ");
                    saveToTextFile(sc.nextLine(), map, player);
                    System.out.println("LE JEU A ETE SAUVEGARDE");
                    System.exit(0);
                }
                lvl.movePerso(choice);
                

            }
            if (lvl.isDone()) {
                player.setCurrentCase('o');
                player.setLife(3); // remet les vies quand le niveau est terminé
                lvlnumber++;
                timer.secondPassed =0;


            }
            if (lvl.isOver()) {
                System.out.println("LOOSER");
                System.exit(0);
                timer.secondPassed =0;

            }
        }catch (IllegalStateException e){
            System.out.println(" ");
        }*/
    }
}