/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import modele.Perso;
import modele.Map;

public class Affichage {

    public static void afficher(Map map, Perso perso){
        for (int i = 0; i < map.getSizeY(); i++) {
            for (int j = 0; j <  map.getSizeX(); j++) {
                System.out.print(" "+map.getCase(i, j));
            }
            System.out.println();
            }
        }
    }
