public class MyList<T> {
    private T[] array;
    private int crtPos;

    public MyList() {
        array = (T[]) new Object[3]; // 배열 크기 조정 필요
        crtPos = 0;
    }

    public void add(T obj) {
        array[crtPos] = obj;
        crtPos++;
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        return crtPos;
    }
}