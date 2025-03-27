/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection9;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Collection9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("2");
        arrayList.add("3");
        
        Vector v = new Vector();
        v.add("A");
        v.add("C");
        v.add("E");
        v.add("D");
        v.add("B");
        System.out.println("Before Copy, Vector Contains: " + v);
        Collections.copy(v,arrayList);
        System.out.println("After Copy, Vector Contains: " + v);
        
    }
    
}
