import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int  DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public void add(int index, E element){
            elements = Arrays.copyOf(elements,elements.length + 1);
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i-1];
            }
        elements[index] = element;
    }
    public E remove(int index){
        E temp;
        if (index>= elements.length)
            temp = null;
        else {
            temp = (E) elements[index];
            for (int i = index; i < elements.length-1 ; i++) {
                elements[i] = elements[i+1];
            }
        }
        return temp;
    }
    public int size(){
        return elements.length;
    }
    public boolean contains(E o){
        boolean checkContains = false;
        for (Object element : elements) {
            if (element == o) {
                checkContains = true;
                break;
            }
        }
        return checkContains;
    }
    public int indexOf(E o){
        int index = -1;
        for (int i = 0; i < elements.length ; i++) {
            if (elements[i] == o){
                index = i;
                 break;}
        }
        return index;
    }
    public void ensuaCapacity(int minCapacity){
       if (minCapacity > elements.length)
           elements = Arrays.copyOf(elements,minCapacity);
       else System.out.println("ngan hon ban dau");
    }
    public E get(int i){
        return (E) elements[i];
    }
    void clear(){
        Arrays.fill(elements, 0);
    }
}
