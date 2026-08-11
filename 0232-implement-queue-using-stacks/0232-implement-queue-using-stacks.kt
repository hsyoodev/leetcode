class MyQueue() {
    val stack1 = Stack<Int>()
    val stack2 = Stack<Int>()

    fun push(x: Int) {
        stack1.push(x)
    }

    fun pop(): Int {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop())
            }
        }

        return stack2.pop()
    }

    fun peek(): Int {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop())
            }
        }
        
        if(!stack2.isEmpty()) {
            return stack2.peek()
        } 

        return stack1.peek()
    }

    fun empty(): Boolean {
        return stack1.isEmpty() && stack2.isEmpty()
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */
