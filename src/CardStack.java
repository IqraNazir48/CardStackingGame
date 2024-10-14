import java.util.Scanner;
public class CardStack {
    Node top;
    int length;
    int score=0;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int size(){
        return length;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return top.data;
    }
    public void push(int data){
        Node n=new Node(data);
        if(data>peek() || isEmpty()){
            n.next=top;
            top=n;
            length++;
            score+=2;
            System.out.println("Card added successfully...");
        }
        else{
            System.out.println("Your data is less than that on Peek of Stack!!");
            System.out.println("Wanna you add or discard it!!!");
            System.out.println("Wanna discard(Your score will remain same): Enter 1...");
            System.out.println("Wanna push(Your score will be deducted): Enter 2..");
            System.out.print("Enter your choice: ");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            while(choice>2 || choice<1){
                System.out.println("Please Enter correct choice!!");
                choice=sc.nextInt();
            }
            switch(choice){
                case(1):{
                    System.out.println("Card is discarded!!");
                    break;
                }
                case(2):{
                    int s=0;
                    while(data<peek() && peek()!=-1){
                        System.out.println(getCardName(pop())+" has been removed...");
                        s++;
                    }
                    System.out.println(getCardName(data)+"has been added Successfully...");
                    System.out.println("Whoops!! Your score deducted by "+s+" ...");
                    n.next=top;
                    top=n;
                    length++;
                    break;
                }
                default:{
                    System.out.println("Some error occurred!!!");
                }
            }
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty...");
            return -1;
        }
        int value=top.data;
        top=top.next;
        length--;
        score = Math.max(0, score - 1);
        return value;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("---------No cards in the stack!!---------");
            return;
        }
        Node current=top;
        System.out.println("---------CARDS--------");
        System.out.println("----------------------");
        while(current!=null){
            System.out.println("          "+getCardName(current.data));
            current=current.next;
        }
        System.out.println("----------------------");
    }
    public String getCardName(int data) {
        switch (data) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return String.valueOf(data);
        }
    }
    public boolean isPresent(int key){
        Node current=top;
        while(current!=null){
            if(current.data==key){
                return true;
            }
            current=current.next;
        }
        return false;
    }
}
