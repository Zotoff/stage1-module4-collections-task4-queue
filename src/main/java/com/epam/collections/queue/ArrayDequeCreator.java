package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(secondQueue.remove());
        arrayDeque.add(secondQueue.remove());
        boolean turn = true;
        while (!(firstQueue.isEmpty() && secondQueue.isEmpty())){
            if(turn){
                firstQueue.add(arrayDeque.pollLast());
                arrayDeque.add(firstQueue.remove());
                arrayDeque.add(firstQueue.remove());
            } else {
                secondQueue.add(arrayDeque.pollLast());
                arrayDeque.add(secondQueue.remove());
                arrayDeque.add(secondQueue.remove());
            }
            turn = !turn;
        }
        return arrayDeque;
    }
}
