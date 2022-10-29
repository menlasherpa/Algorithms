//import code.code.SinglyLinkedList;
//
//import java.util.LinkedHashMap;
//import java.util.LinkedList;
//
//
//
//public class Problem2 {
//
//    static Node head;
//
//
//    public static void main(String[] args) {
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.add(String.valueOf(85));
//        list.add(String.valueOf(15));
//        list.add(String.valueOf(4));
//        list.add(String.valueOf(20));
//
//
//        System.out.println("Given linked list is: ");
//        list.print(head);
//        head = list.reverseSinglyLinkedList(head);
//        System.out.println(" ");
//        System.out.println("Reversed linked list is: ");
//        list.print(head);
//    }
//
//
//    // Node class
//    public static class Node {
//        int data;
//        public Node next;
//
//        // constructor
//        Node (int d) {
//            data = d;
//            next = null;
//        }
//
//
//    }
//
//    public static Node reverseSinglyLinkedList(Node node) {
//        Node prev = null;
//        Node current = node;
//        Node next = null;
//
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = prev;
//        }
//
//        node = prev;
//        return node;
//    }
//
//    public static void print(Node node) {
//        while (node != null) {
//            System.out.println(node.data + " ");
//        }
//    }
//
//}
