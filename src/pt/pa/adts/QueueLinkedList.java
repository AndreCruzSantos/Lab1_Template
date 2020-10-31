package pt.pa.adts;

/**
 * TODO: Fornecer documentação da classe
 *
 * @param <T>
 */
public class QueueLinkedList<T> implements Queue<T> {

    private Node header, trailer;
    private int size;
    private int capacity;

    /**
     * Contrutor da classe que inicializa a queue vazia
     */
    public QueueLinkedList(int capacity) {
        //TODO: construtor deve inicializar uma fila vazia
        this.header = new Node(null,null,null);
        this.trailer = new Node(null,null,null);
        this.size = 0;
        this.capacity = capacity;
    }


    @Override
    public void enqueue(T element) throws FullQueueException{
            if(size() == capacity){ throw new FullQueueException();}

            Node n = this.trailer;
            this.trailer = new Node(element,null,null);
            if(isEmpty()){
                this.header = this.trailer;
            }else{
                trailer.next = n;
                trailer.next.prev = this.trailer;
            }
            size++;
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
        this.size =0;
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
