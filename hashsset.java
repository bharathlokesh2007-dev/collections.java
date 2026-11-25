import java.util.HashSet;

public class hashsset {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>();
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
