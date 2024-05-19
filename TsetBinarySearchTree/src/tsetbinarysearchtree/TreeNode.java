package tsetbinarysearchtree;

public class TreeNode<E> {

    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode() {
    }

    public TreeNode(E element) {
        this.element = element;
    }

    
    
    public TreeNode(E element, TreeNode<E> left, TreeNode<E> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" + "element=" + element + ", left=" + left + ", right=" + right + '}';
    }
    
    

}
