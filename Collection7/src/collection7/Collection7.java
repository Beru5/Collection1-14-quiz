/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection7;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Collection7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Enumeration days;
       Vector dayNames = new Vector();
       dayNames.add("Sunday");
       dayNames.add("Monday");
       dayNames.add("Tuesday");
       dayNames.add("Wednesday");
       dayNames.add("Thursday");
       dayNames.add("Friday");
       dayNames.add("Saturday");
       
       days = dayNames.elements();
       while (days.hasMoreElements ())
       System.out.println(days.nextElement());
    }
    
}
