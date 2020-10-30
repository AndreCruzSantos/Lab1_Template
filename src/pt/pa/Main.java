package pt.pa;

import pt.pa.adts.Queue;
import pt.pa.adts.QueueLinkedList;


public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new QueueLinkedList<>();

        try {
            for (int i = 0; i < 30; i++) {
                queue.enqueue(i);
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Queue is empty? " + queue.isEmpty());

            System.out.println("Head of the queue is: " + queue.front());

            System.out.println("Dequeue all elements from queue: ");
            while(!queue.isEmpty()){
                System.out.println(queue.dequeue());
            }

            System.out.println("Queue is empty? " + queue.isEmpty());

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
