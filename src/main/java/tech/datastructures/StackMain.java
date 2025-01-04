package tech.datastructures;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        // stack  = LIFO datastructure last in first out
        //          store objects into a sort of vertical tower
        //          push() to add an object
        //          pop() to remove an object
        // Stack intial capicity would be 10 once it crosses that capicity it doubles


        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty()); // true


        for(int i=0;i<20;i++){
            stack.push("Mint"+i);
        }

     /*   stack.add("MintG");
        stack.add("MintB");
        stack.add("MintC");
        stack.add("MintP");*/

        System.out.println(stack.capacity());
        System.out.println(stack.size());

        System.out.println(stack.push("push1"));

        System.out.println(stack.capacity());
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.search("Mint8")); // from top it returns index from 1,2,...
        System.out.println(stack.push("Mint8"));
        System.out.println(stack.search("Mint8"));

    }
}
