package pt.pa.adts;

/**
 * Interface que define uma fila
 *
 * @param <T>
 */
public interface Queue<T> {

    //TODO: definir operações do ADT e documentá-las

    /**
     * Insere o elemento no final da fila, a operaçao resulta em erro se a fila estiver cheia
     * @param element
     * @throws FullQueueException
     */
    public void enqueue(T element) throws FullQueueException;

    /**
     * Retira um elemento do inicio da fila
     * @return element
     * @throws EmptyQueueException
     */
    public T dequeue() throws EmptyQueueException;

    /**
     * Devolve, sem remover, o elemento que se encontra no inicio da fila, a operaçao resulta em erro se a fila estiver vazia
     * @return element
     *
     * @throws EmptyQueueException
     */
    public T front() throws EmptyQueueException;

    /**
     * Devolve o numero de elementos que se encontram na fila
     *
     * @return size
     */
    public int size();

    /**
     * Devolve o valor logico que indica se a fila se encontra vazia, ou nao.
     * @return
     *
     * @return boolean
     */
    public boolean isEmpty();

    /**
     * Descarta todos os elementos da fila, ficando esta vazia.
     */
    public void clear();
}
