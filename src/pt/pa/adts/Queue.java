package pt.pa.adts;

/**
 * Interface que define uma fila
 *
 * @param <T>
 */
public interface Queue<T> {

    //TODO: definir operações do ADT e documentá-las

    /**
     * Insere um elemento no fim de um fila
     *
     * @param e
     *
     * @throws FullQueueException
     */
    public void enqueue(T e) throws FullQueueException;

    /**
     * Retira um elemento do inicio da fila
     *
     * @throws EmptyQueueException
     */
    public T dequeue() throws EmptyQueueException;

    /**
     * Devolve sem remover o elemento que se encontra no inicio da fila
     *
     * @throws EmptyQueueException
     */
    public T front() throws EmptyQueueException;

    /**
     * Devolve o tamanho da fila
     *
     * @return size
     */
    public int size();

    /**
     * Devolve um valor logico que indica se a fila esta vazia.
     *
     * @return boolean
     */
    public boolean isEmpty();

    /**
     * Descarta todos os elementos da fila, ficando esta vazia.
     */
    public void clear();
}
