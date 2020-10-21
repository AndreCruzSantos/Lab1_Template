package pt.pa.adts;

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
        this.trailer = new Node(null,null,header);
        this.size = 0;
        this.header.setPrev(this.trailer);
    }

    /**
     * Insere um elemento no final da fila, e resulta num erro se a fila estiver cheia.
     *
     * @param e
     *
     * @throws FullQueueException
     */
    @Override
    public void enqueue(T e) throws FullQueueException{
        try{
            Node n = new Node(e,null,trailer);
            this.trailer = n;
            size++;
        }catch(OutOfMemoryError e){
            throw new FullQueueException("This queue is full");
        }
    }

    /**
     * Retira um elemento do inicio da fila e resulta num erro se a fila estiver vazia
     * @return element
     * @throws EmptyQueueException
     */
    @Override
    public T dequeue() throws EmptyQueueException{
        if(isEmpty()) throw new EmptyQueueException("The queue is empty");

        Node n = new Node(header.prev.element, header.prev.prev, null);
        T element = header.element;
        this.header = n;
        size--;
        return element;
        }
    }

    /**
     * Devolve o elemento que se encontra no inicio da fila sem o remover e resulta num erro se a fila estiver
     * vazia
     *
     * @return element
     *
     * @throws EmptyQueueException
     */
    @Override
    public T front() throws EmptyQueueException{
        if(isEmpty()) throw new EmptyQueueException("The queue is empty");

        T element = header.element;

        return element;
    }

    /**
     * Retorna o tamanho da fila
     *
     * @return size
     */
    @Override
    public int size(){
        return size;
    }

    /**
     * Retorna um valor logico que indica se a fila esta vazia.
     *
     * @return boolean
     */
    @Override
    public boolean isEmpty(){
        return (size == 0);
    }

    /**
     * Retira todos os elementos da fila, ficando esta vazia.
     */
    @Override
    public void clear(){
        this.header = null;
        this.trailer = null;
        this.size = 0;
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

        public T getElement(){
            return this.element;
        }

        public Node getNext(){
            return this.next;
        }

        public Node getPrev(){
            return this.prev;
        }

        public void setElement(T element){
            this.element = element;
        }

        public void setNext(Node n){
            this.next = n;
        }

        public void setPrev(Node n){
            this.next = n;
        }
    }
}
