import java.util.LinkedList;

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Learn java");
        tasks.add("Learn python");
        tasks.add("Learn react");
        tasks.addFirst("make plan");
        tasks.addLast("Build project");
        System.out.println(tasks);
        tasks.removeFirst();
        tasks.removeLast();
        System.out.println("Final: "+tasks);
    }
}
