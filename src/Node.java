import java.util.ArrayList;
public class Node<Key extends Comparable<Key>, Value> {

    private Key key;
    private Value value;
    private int depth;
    private ArrayList<Node> childConnections;// = new ArrayList<Node>();
    private ArrayList<Node> parentConnections;
    //private Node<Key, Value> left;///need an arraylist of nodes
    //private Node<Key, Value> right;//need an arraylist of nodes

    public Node(Key key, Value value) {
        this.key = key;
        this.value = value;
        childConnections = new ArrayList<Node>();
        parentConnections = new ArrayList<Node>();
        //we need to initialize the arraylists here
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
    public void addChild(Node<Key, Value> child) {
        this.childConnections.add(child);
    }
    public int getNumChildren(){

        return childConnections.size();
    }

  //  public int getTotalChildren(){ //this will retunr the total number of children of a given  node through recursivley meming
        //we will use this in our for loop that gets the total number of nodes so be can do some binary math and figure out the suff

    //}


}