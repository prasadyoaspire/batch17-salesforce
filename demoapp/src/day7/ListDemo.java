package day7;
import java.util.ArrayList;
import java.util.Iterator;
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("raj");
        names.add("sam");
        names.add("krish");
        names.add("sita");
        names.add("virat");

        System.out.println("size: "+names.size());

        String myName = names.get(2);
        System.out.println("myname: "+myName);

        String inputName = "sitadfdfd";
        System.out.println("isExising:"+names.contains(inputName));

        Iterator<String> i = names.iterator();
        while(i.hasNext()) {
           String n =  i.next();
           System.out.println(n);
        }
    }
}
