import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> str = new LinkedHashSet<>();
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
