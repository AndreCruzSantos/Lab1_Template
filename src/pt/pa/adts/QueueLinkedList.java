package pt.pa.adts;

import java.sql.SQLOutput;

/**
 * TODO: Fornecer documentação da classe.
 *
 * @param <T>
 */
public class QueueLinkedList<T> implements Queue<T> {

    private Node header, trailer;
    private int size;

    /**
     * Contrutor da classe que inicializa a queue vazia
     */
    public QueueLinkedList() {
        //TODO: construtor deve inicializar uma fila vazia
        this.header = new Node(null,null,null);
        this.trailer = new Node(null,null,null);
        this.size = 0;
    }


    @Override
    public void enqueue(T element) throws FullQueueException{
        try{
            Node n = this.trailer;
            this.trailer = new Node(element,null,null);
            if(isEmpty()){
                this.header = this.trailer;
            }else{
                trailer.next = n;
                trailer.next.prev = this.trailer;
            }
            size++;
            System.out.println(trailer.element);
        }
        catch(OutOfMemoryError e){
            throw new FullQueueException("No memory");
        }
    }

    @Override
    public T dequeue() throws EmptyQueueException{
        if(isEmpty()) throw new EmptyQueueException();
        T e = header.element;
        this.header = this.header.prev;
        size--;
        return e;
    }

    @Override
    public T front() throws EmptyQueueException{
        if(isEmpty()) throw new EmptyQueueException();

        return header.element;
    }

    @Override
    public int size(){
        return this.size;
    }

    @Override
    public boolean isEmpty(){
        return (size == 0);
    }

    @Override
    public void clear(){
        this.header = null;
        this.trailer = null;
    }


    private class Node {
        private T element;
        private Node next;
        private Node prev;

        public Node(T element, Node prev, Node next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
