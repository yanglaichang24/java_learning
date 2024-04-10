package yang.sort;

public class Node<T> {

    T t;
    Node<T> parent;
    Node<T> left_child;
    Node<T> right_child;

    public Node(){
    }

    public Node(T t,Node parent){
        this.t = t;
        this.parent = parent;
    }

    public Node(T t,Node parent,Node left,Node right){
        this.t = t;
        this.parent = parent;
        this.left_child = left;
        this.right_child = right;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public Node<T> getLeft_child() {
        return left_child;
    }

    public void setLeft_child(Node<T> left_child) {
        this.left_child = left_child;
    }

    public Node<T> getRight_child() {
        return right_child;
    }

    public void setRight_child(Node<T> right_child) {
        this.right_child = right_child;
    }
}
