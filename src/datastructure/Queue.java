package datastructure;

public class Queue {

    int maxSize = 4;
    int[] queue = new int[maxSize];
    int head = 0, tail = 0;

    //insert element into the queue
    void push(int item){
        if (maxSize == tail){
            System.out.println("stack overflow");
        } else {
            queue[tail] = item;
            tail++;
        }
    }

    //remove element into the queue
    void pop(){
        if (head == tail){
            System.out.println("stack underflow");
        } else {
            for (int i = 0; i < tail-1; i++) {
                queue[i] = queue[i+1];
            }
        }

        //set queue[tail] to 0
        if (tail < maxSize)
            queue[tail] = 0;

        tail--;
    }

    void print(){
        if (head == tail)
            System.out.println("queue is empty");

        for (int i = head; i < tail; i++) {
            System.out.println(queue[i]);
        }
    }

    void front(){
        if (head == tail)
            System.out.println("queue is empty");

        System.out.println("front element = "+queue[head]);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.push(10);
        queue.push(14);
        queue.push(16);
        queue.push(19);

        queue.print();

        queue.front();

        queue.pop();

        queue.print();
    }
}
