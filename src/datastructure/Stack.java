package datastructure;

import java.util.ArrayList;

public class Stack<T> {

    ArrayList<T> arr;
    //default value of top variable when stack is empty
    int topOfStack = -1;
    int size;

    public Stack(int size) {
        this.size = size;
        this.arr = new ArrayList<>(size);
    }

    //push generic element into stack
    void push(T item){
        //checking if array is full
        if ((topOfStack + 1) == size){
            System.out.println("stack overflow");
        }
        else {
            //increment for go to next position
            topOfStack = topOfStack+1;

            //over-writing existing element
            if (arr.size() > topOfStack)
                arr.set(topOfStack,item);
            else
                arr.add(item); //create a new element
        }
    }

    //to return top most element of stack
    T top(){
        //if stack is empty
        if (topOfStack == -1){
            //display message when there are no elements in the stack
            System.out.println("stack underflow");

            return null;
        }
        //else elements are present so return the topmost element
        else
            return arr.get(topOfStack);
    }

    //to delete last element of stack
    void pop(){
        //if stack is empty
        if (topOfStack == -1){
            //display message when there are no elements in the stack
            System.out.println("stack underflow");
        }

        else
            topOfStack--;
    }

    //check if stack is empty or not
    boolean empty() {return topOfStack == -1;}

    //print stack
    String print(){
        String ans = "";

        for (int i = 0; i < topOfStack; i++) {
            ans += String.valueOf(arr.get(i)) + "->";
        }

        ans += String.valueOf(arr.get(topOfStack));

        return ans;
    }

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(3);

        //pushing element to string stack
        stack.push("ichwan");
        stack.push("sholihin");

        System.out.println("after pushing 2 elements "+stack);

        //pushing another element to above stack
        stack.push("testing");

        System.out.println(stack.print());
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.print());
        System.out.println(stack.empty());
    }
}
