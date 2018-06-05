public class SingleLinkedList {
    public Node head;
    public SingleLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(){
        Node runner = head;
        while(runner.next.next != null){
            runner = runner.next;
        }
        runner.next = null;
    }
    public void printValues(){
        Node runner = head;
        while(runner != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
        System.out.println("------------");

    }
    public Node findValue(int value){
        Node runner = head;
        while(runner != null){
            if (runner.value == value){
                return runner;
            }
            runner = runner.next;
        }
        return null;
    }
    
    public void removeNodeAtVal(int value){
        if (head.value == value){
            head = head.next;
        }
        else {
            Node runner = head;
            while(runner.next != null){
                if (runner.next.value == value){
                    runner.next = runner.next.next;
                }
                runner = runner.next;
            }
        }
    }

    public void removeAt(int num){
        if (num == 0){
            head = head.next;
            System.out.println("Head removed");
        }
        else {
            Node runner = head;
            int count = 0;
            while(runner.next != null){
                ++count;
                if (count == num){
                    System.out.println("Node removed:" + runner.next);
                    runner.next = runner.next.next;
                }
                runner = runner.next;
            }
        if (num > count){ 
            System.out.println("No node removed");
        }
        }
    }
}