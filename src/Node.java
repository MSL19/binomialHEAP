import java.util.ArrayList;
public class Node<Key extends Comparable<Key>, Value> {

    private Key key;
    private Value value;
    private int depth;
    private ArrayList<Node> childConnections;// = new ArrayList<Node>();
    private ArrayList<Node> parentConnections;
    //private Node<Key, Value> left;///need an arraylist of nodes
    //private Node<Key, Value> right;//need an arraylist of nodes
    private int size;

    public Node(Key key, Value value, int size) {
        this.key = key;
        this.value = value;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Node<Key, Value> getChildConnection(int i) {
        return childConnections.get(i);
    }
    public Node<Key, Value> getParentConnection(int i) {
        return parentConnections.get(i);
    }
    public void setLeft(Node<Key, Value> left) {
        this.left = left;
    }

    public Node<Key, Value> getRight() {
        return right;
    }

    public void setRight(Node<Key, Value> right) {
        this.right = right;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}