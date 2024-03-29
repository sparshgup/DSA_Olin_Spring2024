import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

class StackTest {

    @Test
    fun enqueue() {
        val queue = Queue<Int>()
        queue.enqueue(1)
        assertEquals(1, queue.peek())
        queue.enqueue(2)
        assertEquals(1, queue.peek())
        assertEquals(1, queue.dequeue())
        assertEquals(2, queue.dequeue())
    }

    @Test
    fun dequeue() {
        val queue = Queue<Int>()
        assertNull(queue.dequeue())
        queue.enqueue(1)
        assertEquals(1, queue.dequeue())
        assertNull(queue.dequeue())
    }

    @Test
    fun peek() {
        val queue = Queue<Int>()
        assertNull(queue.peek())
        queue.enqueue(1)
        assertEquals(1, queue.peek())
        queue.enqueue(2)
        assertEquals(1, queue.peek())
    }

    @Test
    fun isEmpty() {
        val stack = Stack<String>()
        assertTrue(stack.isEmpty())
    }
}