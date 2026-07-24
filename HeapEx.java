import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapEx {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        minHeap.add(40);
        minHeap.add(50);
        minHeap.add(20);
        minHeap.add(30);
        minHeap.add(40);
        minHeap.poll();
        System.out.println(minHeap.peek());
        System.out.print(minHeap);
        System.out.println();
        maxHeap.add(40);
        maxHeap.add(50);
        maxHeap.add(20);
        maxHeap.add(30);
        maxHeap.add(40);
        maxHeap.poll();
        System.out.println(maxHeap.peek());
        System.out.print(maxHeap);
    }
}