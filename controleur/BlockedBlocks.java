/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

public enum BlockedBlocks {
    M('M'),X('X'),W('W');

    public char asChar() {
        return asChar;
    }
    private final char asChar;

    BlockedBlocks(char asChar){
        this.asChar = asChar;
    }
}