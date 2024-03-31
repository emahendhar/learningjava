package com.java2bigdata.algorithms;

//Node class
class Node{

    int data;
    Node next;

    // Constructor to initialize the node object
    public Node(int data){
    this.data=data;
    this.next=null;
    }

}




//Linkedlist class as BubbleSortLinkedList
 class BubbleSortLinkedList {

    Node head;


    void printList(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+ "->");
                temp=temp.next;
            }
        System.out.print("None");

    }


     public static void main(String[] args) {

         int[] arr = {37,2,78,4,88,366};

         BubbleSortLinkedList blink = new BubbleSortLinkedList();


         System.out.println("Linked list before data enter");
         blink.printList();


         blink.head = new Node(arr[0]);

            Node start = blink.head;



         System.out.println("Linked list one element insert check");
         blink.printList();


         for(int i=1;i<arr.length;i++){
             start.next=new Node(arr[i]);
             start=start.next;
         }

         System.out.println("Linked list before sorting all elements");
         blink.printList();



         


     }



}
