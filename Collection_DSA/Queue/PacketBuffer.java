package Collection_DSA.Queue;

public class PacketBuffer {

    private int[] data;
    private int front;
    private int count;

    public PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    public boolean enqueue(int packetId) {
        if (count == data.length) {
            return false;
        }

        data[(front + count) % data.length] = packetId;
        count++;
        return true;
    }

    public int dequeue() {
        if (count == 0) {
            throw new RuntimeException("Buffer Empty");
        }

        int value = data[front];
        front = (front + 1) % data.length;
        count--;
        return value;
    }

    public static void main(String[] args) {
        PacketBuffer buffer = new PacketBuffer(5);

        buffer.enqueue(101);
        buffer.enqueue(102);
        buffer.enqueue(103);

        System.out.println(buffer.dequeue());

        buffer.enqueue(104);
        buffer.enqueue(105);
        buffer.enqueue(106);

        while (true) {
            try {
                System.out.println(buffer.dequeue());
            } catch (RuntimeException e) {
                break;
            }
        }
    }
}