import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<String> str = new TreeSet<>();
        str.add("Java");
        str.add("python");
        str.add("react");
        str.add("Java");
        System.out.println(str);
        System.out.println("Contains java: "+str.contains("java"));
        str.remove("python");
        System.out.println("After Removal: "+str);
    }
}

