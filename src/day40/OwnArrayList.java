package day40;


class OwnArrList{
    int[] arr;
    int size;
    int idx;


    OwnArrList(int capicity){
        arr = new int[capicity];
    }

    void add(int elem){
        if(arr.length == size){
            int[] arr2 = new int[arr.length*2];

            for (int i = 0; i < arr.length; i++) {
                arr2[i]  = arr[i];
            }

            arr = arr2;

        }

        arr[idx] = elem;
        idx++;
        size++;


    }

    void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }


    int capicity (){
        return arr.length;
    }

//    get element to check specific index positoon index element

    int getIdx(int index){
        return arr[index];
    }

//    how to set element on specific index postion

    void setIdx(int index ,int element){
         arr[index] = element;

    }
}


public class OwnArrayList {
    static void main(String[] args) {
        OwnArrList arr1 = new OwnArrList(5);
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        arr1.add(50);
        arr1.add(60);

        arr1.setIdx(1,100);
        arr1.display();
//        System.out.println(arr1.getIdx(4));

//        System.out.println(arr1.capicity());
//        arr1.display();


    }
}
