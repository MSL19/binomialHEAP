import java.util.ArrayList;

public class driver {
    public static void main(String[] args) {
        ArrayList<Node> nar = new ArrayList<Node>();
        Node n = new Node(5,5);
        nar.add(n);
        binomialHeap bH = new binomialHeap(nar);

        Node n2 = new Node (3,3);
        bH.put(n2);

        Node n3 = new Node (10,10);
        bH.put(n3);

        Node n4 = new Node (8,8);
        bH.put(n4);

        System.out.println(bH.toString());


    }
}
