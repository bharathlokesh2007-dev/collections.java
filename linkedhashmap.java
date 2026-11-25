import java.util.LinkedHashMap;

public class linkedhashmap {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> num = new LinkedHashMap<>();
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
