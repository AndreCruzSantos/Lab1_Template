package pt.pa.adts;

public class FullQueueException extends RuntimeException{
    public FullQueueException(){
        super("Queue is full");
    }
}
