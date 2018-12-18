package List;

import java.util.*;
import java.util.function.UnaryOperator;

public class MyArrayList<E> implements List<E>, Iterable<E> {
    private static final Object[] EMPTY_ARRAY = {};
    private E[] values;

    private int size = 0;
    private int modificationCount = 0;

    public static Object[] getEmptyArray() {
        return EMPTY_ARRAY;
    }

    public E[] getValues() {
        return values;
    }

    public void setValues(E[] values) {
        this.values = values;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public MyArrayList(){
        values = (E[])EMPTY_ARRAY;
    }

    public MyArrayList(int size) {
        values = (E[])new Object[size];
    }

    public boolean add(E value) {
        ensureCapasity(size +1);
        values[size++] = value;
        modificationCount++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {

    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    private void ensureCapasity(int capacity) {
        if(capacity >= values.length) {
            int newSize = values.length * 3 / 2;
            if(newSize == values.length) newSize++;
            if( newSize < capacity){
                newSize = capacity;
            }
            values = Arrays.copyOf(values, newSize);
        }
    }

    @Override
    public void add(int index, E value) {
        ensureCapasity(size +1 );
        if(index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(values, index, values, index+1, values.length - index - 1);
        values[index] = value;
        size++;
        modificationCount++;
    }

    public E remove(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E oldValue = values[index];
        System.arraycopy(values,index+1,values,index, size -index);
        size--;
        modificationCount++;
        return oldValue;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new MyListIterator();
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }



    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    public <T> T[] toArray (T[] arr){
        if( arr.length < values.length ) {
            return (T[])Arrays.copyOf(values, size, arr.getClass());
        }
        System.arraycopy(values,0,arr,0,values.length);
        return arr;
    }

    private  class MyListIterator implements Iterator<E>, ListIterator<E>{
        int nextIndex = 0;
        int lastReturnedIndex = -1;
        int modificatorCountList = modificationCount;


        @Override
        public boolean hasNext() {
            if (modificatorCountList != modificationCount) {
                throw new ConcurrentModificationException();
            }
            return nextIndex < size;

        }

        @Override
        public E next() {

            if(!hasNext())
                throw new ArrayIndexOutOfBoundsException();
            return values[nextIndex++];
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public E previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {
            if(lastReturnedIndex >= 0 && lastReturnedIndex < size) {
                MyArrayList.this.remove(lastReturnedIndex);
            }
            modificatorCountList++;
        }

        @Override
        public void set(E e) {

        }

        @Override
        public void add(E e) {

        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyListIterator();
          /*      new Iterator<E>() {
            int nextIndex = 0;

            @Override
            public boolean hasNext() {
                return nextIndex < size;
            }

            @Override
            public E next() {
                if(!hasNext())
                    throw new ArrayIndexOutOfBoundsException();
                return values[nextIndex++];
            }
        };*/
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}

