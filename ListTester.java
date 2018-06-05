public class ListTester {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.printValues();
        sll.remove();
        sll.printValues();
        sll.remove();
        sll.printValues();
        System.out.println(sll.findValue(100));
        System.out.println(sll.findValue(5));
        sll.printValues();
        sll.removeNodeAtVal(10);
        sll.printValues();
        sll.removeAt(1);
    }
}