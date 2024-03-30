import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {


    Queue <Integer> q = new Queue<>();
    Queue <Integer> q2 = new Queue<>();

    @BeforeEach
    void setup(){
        q.add(18);
        q.add(54);
        q.add(46);
        q.add(1);
        q.add(48);


    }

    @Test
    void toIncreaseCapacity() {
                Queue<Integer> queue = new Queue<>();
                int initialCapacity = queue.capacity;


                queue.toIncreaseCapacity();

                
                assertEquals(initialCapacity + 200, queue.capacity);
            }




    @Test
    void add() {
        assertEquals(5,q.size());

    }

    @Test
    void peek() {
        assertEquals(18,q.peek());
    }

    @Test
    void pool() {
        assertEquals(18, q.pool());

    }

    @Test
    void remove() {
        q2.add(1);
        q2.remove();
        assertTrue(q2.isEmpty());
    }

    @Test
    void isEmpty() {
        assertEquals(0,q2.size());

    }

    @Test
    void print() {
        q.print();
    }

    @Test
    void size(){
        assertEquals(0,q2.size());
        assertEquals(5,q.size());
    }
}