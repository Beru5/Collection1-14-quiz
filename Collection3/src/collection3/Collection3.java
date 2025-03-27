/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection3;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Collection3 {

    public static void main(String[] args) {
        String[] words = {"Magenta", "Red", "White", "Blue", "Cyan"};
        Set <String> uniques = new HashSet<String>();
        Set <String> dups = new HashSet<String>();
        
        for (String a : words)
            if (!uniques.add(a))
                dups.add(a);
        
        uniques.removeAll(dups);
        
        System.out.println("Unique Words: " + uniques);
        System.out.println("Duplicate Words: " + dups);
}
    
}