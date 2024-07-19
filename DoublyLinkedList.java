public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void addNodeToBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addNodeToEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addNodeAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position <= 0 || head == null) {
            addNodeToBeginning(data);
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current.next == null) {
                addNodeToEnd(data);
                return;
            }
            current = current.next;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }

        current.next = newNode;
    }

    public void deleteNodeAtPosition(int position) {
        if (head == null || position < 0) {
            System.out.println("Position out of range.");
            return;
        }

        Node current = head;

        if (position == 0) {
            deleteNodeFromBeginning();
            return;
        }

        for (int i = 0; i < position; i++) {
            if (current.next == null) {
                System.out.println("Position out of range.");
                return;
            }
            current = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }

    public void deleteNodeFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteNodeFromEnd() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        if (tail.prev == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addNodeToEnd(1);
        dll.addNodeToEnd(2);
        dll.addNodeToEnd(3);
        dll.addNodeToBeginning(89);
        dll.addNodeToBeginning(45);
        dll.addNodeToEnd(4);
        dll.addNodeAtPosition(99, 3);
        dll.printList();

        dll.deleteNodeAtPosition(3);
        dll.printList();

        dll.deleteNodeFromBeginning();
        dll.printList();

        dll.deleteNodeFromEnd();
        dll.printList();
    }
}
