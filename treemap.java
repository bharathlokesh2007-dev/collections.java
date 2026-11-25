import java.util.TreeMap;
public class treemap {

    public static void main(String[] args) {
        TreeMap<Integer,String> num = new TreeMap<>();
        num.put(101,"CSE");
        num.put(102,"ECE");
        num.put(103,"EEE");
        System.out.println(num);
        System.out.println("Student101: "+num.get(101));
        num.put(102,"CIVIL");
        num.remove(103);
        System.out.println("Updated Map: "+num);

    }
}

