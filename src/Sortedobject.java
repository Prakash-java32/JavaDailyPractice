import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sortedobject {
    public static void main(String[] args) {
        List<users> al=new ArrayList();
        al.add(new users(3,15,"CSE","prakash"));
        al.add(new users(2,12,"ECE","pravin"));
        al.add(new users(1,16,"PHYSICS","raman"));
        Collections.sort(al);
        System.out.println(al);
    }
}
