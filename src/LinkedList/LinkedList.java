package LinkedList;

public class LinkedList {
    Node head,tail = null;

    private static class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
        }
    }
    public void addIndex(int index, int data){
        Node newNode = new Node(data);
        if(index==0)
        {
            newNode.next=head;
            head = newNode;
            return;
        }
        int count = 0;
        Node temp = head,prev=null;
        while(count<index && temp!=null)
        {
            prev = temp;
            temp = temp.next;
            count++;
        }
        prev.next = newNode;
        newNode.next = temp;
    }
    public void add(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }

        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void removeIndex(int index) {
        if (head == null || index < 0) {
            System.out.println("A lista está vazia ou foi colocado um valor de index inválido, tente novamente!");
            return;
        }

        Node current = head;
        int i;

        for (i = 0; current != null && i < index; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Índice fora do alcance da lista, tente novamente!");
            return;
        }

        if (current == head) {
            head = current.next;
        }

        if (current.next != null) {
            current.next.previous = current.previous;
        }
        if (current.previous != null) {
            current.previous.next = current.next;
        }

        current = null;

        System.out.println("Nó no índice " + index + " removido com sucesso!");
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("A lista está vazia");
            return;
        }
        System.out.println("Lista: ");
        while(current != null){
            System.out.println(current.data + "");
            current = current.next;
        }
    }

    public void limparLista() {
        if (head == null) {
            System.out.println("A lista já está vazia!");
            return;
        }

        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.previous = null;
            current.next = null;
            current = next;
        }

        head = null;

        System.out.println("A lista foi limpa com sucesso!");
    }
}

