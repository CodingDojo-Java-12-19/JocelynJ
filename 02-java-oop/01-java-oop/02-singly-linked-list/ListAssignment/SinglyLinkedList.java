public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(){
        head = null;
    }
 
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            return;
        }
        Node runner = this.head;
        while(runner.next != null) {
            runner = runner.next;
        }
        runner.next = newNode;
    }

    private boolean IsEmpty() {
        return this.head == null;
    }

    public void printValues() {
        if(IsEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node runner = this.head;
        while(runner.next != null) {
            System.out.println(runner.value);
            System.out.println(runner.next.value);
            runner = runner.next;
        }
    }

    public void remove(){
        if(head == null){
            return;
        }
        else{
            Node runner = head;
            while(runner.next.next != null){
                runner = runner.next;
            }
            runner.next=null;
        }
    }  
}