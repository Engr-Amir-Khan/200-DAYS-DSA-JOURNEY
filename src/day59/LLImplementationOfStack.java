package day59;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }

}

class  MyStack{
    Node head;
    int len;


    void peek() throws  Exception{
        if(head==null){
            throw new Exception ("stack is empty!");

        }else{
            System.out.println(head.val);;
        }

    }

    void push(int val){

        Node temp = new Node(val);

        temp.next = head;
        head = temp;
        len++;
    }

    int pop() throws  Exception{
        if(head==null){
            throw  new Exception( "stack is empty!");

        }else {

            int x = head.val;
            head = head.next;
            len--;
            return x;
        }
    }



    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }


    int size(){
        return len;
    }
}








public class LLImplementationOfStack {
    static void main(String[] args)throws  Exception {
        MyStack st = new MyStack();

        st.push(10); st.push(20); st.push(30); st.push(40); st.push(50);
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.peek();



    }
}
