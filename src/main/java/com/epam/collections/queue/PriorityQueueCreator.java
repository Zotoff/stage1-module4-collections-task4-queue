package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        PriorityQueue<String> result = new PriorityQueue<>(reverseComparator);
        result.addAll(firstList);
        result.addAll(secondList);

        return result;
    }
}
