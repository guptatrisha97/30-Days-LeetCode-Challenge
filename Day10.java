/*Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.
*/

class MinStack {
   Stack<Integer> stack = new Stack();
    Stack<Integer> min_value = new Stack();

    public void push(int x) {
        if ( min_value.isEmpty() || x <= min_value.peek()) {
            min_value.push(x) ;
        }
        stack.push(x);
    }

    public void pop() {
        if ( stack.peek().equals(min_value.peek())) {
            min_value.pop() ;
        }

        stack.pop() ;

    }

    public int top() {
        return stack.peek() ;
    }

    public int getMin() {

        return min_value.peek() ;
    }
}
