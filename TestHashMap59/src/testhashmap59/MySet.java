package testhashmap59;


public interface MySet<E> extends Iterable<E> {

    public void clear();

    public boolean contains(E e);

    /**
     * Add an element to the set
     */
    public boolean add(E e);

    /**
     * Remove the element from the set
     */
    public boolean remove(E e);

    /**
     * Return true if the set doesn't contain any elements
     */
    public boolean isEmpty();

    /**
     * Return the number of elements in the set
     */
    public int size();

}
