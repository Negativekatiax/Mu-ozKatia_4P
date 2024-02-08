
public class Main {
    public static void main(String[] args) {
        Lista list = new Lista();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display(); // Output: 1 2 3 4 5
        list.remove(5);
        list.display(); // Output: 1 2 4 5
    }
}