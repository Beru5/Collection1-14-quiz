/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection8;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Collection8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector v = new Vector();
        
        v.add("A");
        v.add("B");
        v.add("D");
        v.add("E");
        v.add("F");
        
        System.out.println("Vector contains : " + v);
        
        Enumeration e = v.elements();
        
        ArrayList aList = Collections.list(e);
        
        System.out.println("Arraylist contains : " + aList);
}

    }

