package selfpractice;

import java.util.Comparator;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<String>(new MyOrder());// 16 hashmap
        names.add("Deepak");// key
        names.add("Ram");
        names.add("Mohan");
        names.add("Rajesh");
        names.add("Suman");
        System.out.println(names);

    }

}

class MyOrder implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        return o2.compareTo(o1);
    }

}
