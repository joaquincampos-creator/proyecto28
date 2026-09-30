/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mochila;
import java.util.ArrayList;

public class Mochila {

    public static void main(String[] args) {
        ArrayList<String> mochila = new ArrayList<>();
        mochila.add("espada");
        mochila.add("poción");
        mochila.add(0, "mapa");
        mochila.set(2, "escudo");
        mochila.remove("mapa");
        System.out.println(mochila + " " + mochila.size());
 
    }
    
}
