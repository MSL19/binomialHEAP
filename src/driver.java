import java.util.ArrayList;

public class driver {
    public static void main(String[] args) {
        ArrayList<Node> nar = new ArrayList<Node>();
        Node n = new Node(5,5);
        nar.add(n);
        binomialHeap bH = new binomialHeap(nar);
        System.out.println(bH.toString());

    }
}
