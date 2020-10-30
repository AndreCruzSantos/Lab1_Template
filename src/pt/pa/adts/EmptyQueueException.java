package pt.pa.adts;

import sun.invoke.empty.Empty;

public class EmptyQueueException extends RuntimeException{
    public EmptyQueueException(String message){
        super(message);
    }

    public EmptyQueueException(){
        super("Queue is Empty ");
    }
}
