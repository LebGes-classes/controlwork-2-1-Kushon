public class Queue<T>{
     int top;
     int capacity = 100;
    private Object[] a;
    private int end;
    private int size;

    Queue() {
        this.a = new Object[capacity];;
        this.size = 0;
        this.top = 0;
        this.end = 0;
    }

    public void toIncreaseCapacity(){
        capacity += 200;
        Object[]  b = new Object[capacity];
        System.arraycopy(a, 0, b, 0, size);
        a = b;
    }



    public void add(T el) {
        if(size == capacity){
            toIncreaseCapacity();
        }
        a[end] = el;
        size++;
        end++;

    }


    public T peek() {
        if (isEmpty()){
            return null;
        }
        return (T) a[top];
    }


    public T pool() {
        if(isEmpty()){
            return null;
        }

        Object b = a[top];
        a[top] = 0;
        top++;
        size--;
        return (T)b;
    }


    public void remove() {
        if(isEmpty()){
            System.out.println("Очередь пуста");
        }
        a[top] = 0;
        size--;
        top++;
    }


    public boolean isEmpty()  {
        return size == 0;
    }


    public void print() {
        for(int i = 0; i < size;i++){
            System.out.println(a[i] + " ");
        }

    }

    public int size(){
        return size;
    }
}
