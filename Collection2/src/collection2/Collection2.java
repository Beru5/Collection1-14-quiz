package collection2;
import java.util.*;

public class Collection2 {
    public static void main(String[] args) {
        String[] sentences = {"sistem", "informasi", "dan", "teknologi", "informasi"};
        Set <String> s = new HashSet<String>();
        for (String a : sentences)
            if (!s.add(a))
                System.out.println("Duplicate Detected: " + a);
                System.out.println(s.size() + " Distincted Words: " + s);
    }
    
}
