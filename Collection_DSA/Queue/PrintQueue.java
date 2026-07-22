package Collection_DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {

    private Deque<Integer> printQueue = new ArrayDeque<>();

    public void submitJob(int jobId) {
        printQueue.addLast(jobId);
    }

    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
    }

    public int printNextJob() {
        return printQueue.removeFirst();
    }

    public static void main(String[] args) {
        PrintQueue queue = new PrintQueue();

        queue.submitJob(101);
        queue.submitJob(102);
        queue.submitJob(103);

        queue.submitUrgentJob(999);

        while (!queue.printQueue.isEmpty()) {
            System.out.println(queue.printNextJob());
        }
    }
}