import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> num = new HashMap<>();
        num.put(101,"Bharath");
        num.put(102,"niggalash");
        num.put(103,"LLash");
        System.out.println(num);
        System.out.println("Student101: "+num.get(101));
        num.put(102,"abhilasha");
        num.remove(103);
        System.out.println("Updated Map: "+num);

    }
}
