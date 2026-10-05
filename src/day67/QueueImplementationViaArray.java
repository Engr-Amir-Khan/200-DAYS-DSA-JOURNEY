package day67;

class CircularQueue{
    int[] arr;
    int f;
    int r;
    int size;

    CircularQueue(int capacity){
        arr = new int[capacity];
    }

    void add(int val){

        if(size==arr.length){
            System.out.println("Queue is full");
            return;
        }

        arr[r++] = val;
        if(r==arr.length){
            r=0;
        }
        size++;
    }

    int remove(){

        if(size==0){
            System.out.println("Queue is empty!");
            return -1;
        }

        int v = arr[f];
        f++;
        if(f==arr.length){
            f=0;
        }
        size--;
        return v;
    }

    int peek(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[f];
    }

    void display(){


        if(size==0){
            return;
        }

        if(f>=r){
            for(int i=f; i<arr.length; i++){  //front to end
                System.out.print(arr[i] + " ");
            }

            for(int i=0; i<r; i++){  // 0 to r-1
                System.out.print(arr[i] + " ");
            }
        }else{
            for(int i=f; i<r; i++){  //front to rear
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

    }

}



public class QueueImplementationViaArray {
    static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        System.out.println(q.remove());
        q.display();
        q.add(500);
        q.display();
        System.out.println(q.peek());
        q.add(1000);
        q.display();
//        System.out.println();

        int[] a = q.arr;
        for(int elem: a){
            System.out.print(elem + " ");
        }


    }
}
