package pt.pa.adts;

/**
 * TODO: Fornecer documentação da interface.
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
     * Remove o elemento do inicio da fila, a operaçao resulta em erro se a fila estiver vazia
     * @return element
     * @throws EmptyQueueException
     */
    public T dequeue() throws EmptyQueueException;

    /**
     * Devolve, sem remover, o elemento que se encontra no inicio da fila, a operaçao resulta em erro se a fila estiver vazia
     * @return element
     * @throws EmptyQueueException
     */
    public T front() throws EmptyQueueException;

    /**
     * Devolve o numero de elementos que se encontram na fila
     * @return size
     */
    public int size();

    /**
     * Devolve o valor logico que indica se a fila se encontra vazia, ou nao.
     * @return
     */
    public boolean isEmpty();

    /**
     * Remove todos os elementos da fila, ficando esta vazia
     */
    public void clear();

}
