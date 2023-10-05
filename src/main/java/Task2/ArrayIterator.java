package Task2;

public class ArrayIterator<T> {
    private T[] array;
    private int currentIndex;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.currentIndex = 0;
    }

    public boolean hasNext() {
        return currentIndex < array.length;
    }

    public T next() {
        if (hasNext()) {
            return array[currentIndex++];
        }
        return null;
    }
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5};
        ArrayIterator iterator = new ArrayIterator(array);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
