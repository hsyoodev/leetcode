class MyStack() {
    val queue = LinkedList<Int>()

    fun push(x: Int) {  
        queue.add(x)
        
        for(i in 0 until (queue.size - 1)) {
            queue.add(queue.poll())
        }
    }

    fun pop(): Int {
        return queue.poll()
    }

    fun top(): Int {
        return queue.first
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */
