/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;


import modele.Map;
import modele.Perso;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Enregistrement {

    public static void saveToTextFile(String fileName, Map map, Perso perso) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/TextFile/" + fileName + ".txt")));

            for (int i = 0; i < map.getMap().length; i++) {
                for (int j = 0; j < map.getMap()[i].length; j++) {
                    writer.write(map.getMap()[i][j] + "");
                }

                writer.newLine();
            }
            writer.write("DATA\n");
            writer.write("level:" + Play.lvlnumber + "\n");
            writer.write("x:" + perso.getxPerso() + "\n");
            writer.write("y:" + perso.getyPerso() + "\n");
            writer.write("case:" + perso.getCurrentCase() + "\n");
            writer.write("isLight:" + perso.isIslight() + "\n");
            writer.write("lifes:" + perso.getLife() + "\n");
            writer.flush();
            writer.close();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void readTextFile(String filename) {

    }
}
