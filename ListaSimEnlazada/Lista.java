public class Lista {

    private Nodo head;

    public Lista() {
        head = null;
    }

    public void add(int val) {
        if (head == null) {
            head = new Nodo(val);
        } else {
            Nodo current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Nodo(val);
        }
    }

    public void remove(int val) {
        if (head == null) {
            return;
        }
        if (head.val == val) {
            head = head.next;
            return;
        }
        Nodo current = head;
        while (current.next != null && current.next.val != val) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void display() {
        Nodo current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}