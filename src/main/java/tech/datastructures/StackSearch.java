package tech.datastructures;

import java.util.Stack;

public class StackSearch {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.addAll(java.util.Arrays.asList("Mint0", "Mint1", "Mint2", "Mint3", "Mint4", "Mint5", "Mint6", "Mint7",
                "Mint8", "Mint9", "Mint10", "Mint11", "Mint12", "Mint13", "Mint14",
                "Mint15", "Mint16", "Mint17", "Mint18", "Mint19", "Mint8"));
        System.out.println(stack);

        String target = "Mint8";
        System.out.println(stack.get(0));
        int secondAcc = findSecondAcc(stack,target);
        System.out.println(secondAcc);
    }

    public static int findSecondAcc(Stack<String> stack,String target){
        int firstIndex = -1;
        int secondIndex = -1;

        for(int i=0;i<stack.size();i++){
            if(stack.get(i).equals(target)){
                if(firstIndex==-1){
                    firstIndex=i;

                }else{
                    secondIndex = i;
                    break;
                }
            }

        }



        return secondIndex;
    }


    public static int findSecondOccurrenceFromBottom(Stack<String> stack,String target){
        int occurrenceCount=0;

        for(int i=stack.size();i>=-1;i--)
            if(stack.get(i).equals(target)){
                occurrenceCount++;
                if(occurrenceCount==2)
                    return i;
            }

        return -1;
    }
}
