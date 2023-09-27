package xmlvalidator;

import java.util.LinkedList;

public class myStack implements IStack{
    LinkedList<String> stack;
    
    public myStack()
    {
        stack = new LinkedList<String>();
    }
    
    @Override
    public void push(String s) {
        // TODO Auto-generated method stub
        stack.addFirst(s);
    }

    @Override
    public String pop() {
        // TODO Auto-generated method stub
        return stack.removeFirst();
    }

    @Override
    public String peek() {
        // TODO Auto-generated method stub
        return stack.getFirst();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return stack.isEmpty();
    }
    public void print()
    {
        
    }
}
