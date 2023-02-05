class Stack{
    int top = -1;
    int[] stack = new int[10];

    //push
    public void push(int value){
        if(top == stack.length -1){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top]= value;
    }
    //pop
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        int popped = stack[top];
        top--;
        return popped;
    }
    //peek
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    //isEmpty
    public boolean isEmpty(){
        if(top ==-1){
            return true;
        }
        return false;
    }
    //size
    public int size(){
        return top+1;
    }
    //print
    public void print(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
public class ImplementationStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
    }

}
