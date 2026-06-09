import java.util.Scanner;

class Queue {

    int arr[];
    int FRONT;
    int REAR;
    int maxSize;

    Queue(int size) {
        maxSize = size;
        arr = new int[maxSize];
        FRONT = -1;
        REAR = -1;
    }

    // Check isEmpty()
    boolean isEmpty() {
        if(FRONT == -1 || FRONT > REAR) {
            return true;
        } else { 
            return false;
        }   
    }

    // Check isFull()
    boolean isFull() {
        if(REAR == maxSize - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Insert Element into the Queue (ENQUEUE)
    void enQueue(int ele) {
        if(isFull()) {
            System.out.println("Queue is Full.!");
        } else {
            if(FRONT == -1) {
                FRONT = 0;
            }
                REAR = REAR + 1;
                arr[REAR] = ele;
                System.out.println(ele+" Inserted into the Queue");
        }
    }

    // Delete or Remove the Element into the Queue (DEQUEUE)
    void deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty.!");
        } else {
            System.out.println(arr[FRONT]+" is Removed from Queue");
            FRONT = FRONT + 1;
        }
    }

    // See the Top most / FRONT Element into the Queue (Peek)
    void peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty.!");
        } else {
            System.out.println("Front Element of the Queue is : "+arr[FRONT]);
        }
    }

    // Display the Elements are Presented into the Queue
    void display() {
        if(isEmpty()) {
            System.out.println("Queue is Empty.!");
        } else {
            System.out.print("Elements in Queue are : ");
            for(int i=FRONT; i<=REAR; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

}


public class QueueImplementation {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Queue Size : ");
        int size = sc.nextInt();

        Queue queue = new Queue(size);

        int choice;

        do {
            System.out.println("------QUEUE MENU-----");
            System.out.print("1.ENQUEU\n2.DEQUEUE\n3.PEEK\n4.DISPLAY\n5.EXIT\n");

            System.out.print("Enter the Choice : ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter the Value of Element : ");
                    int ele = sc.nextInt();
                    queue.enQueue(ele);
                    break;
                case 2:
                    queue.deQueue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice.!");
            }
        } while (choice != 5);
            sc.close();

    }
}