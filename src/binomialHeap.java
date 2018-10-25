public class binomialHeap <Key extends Comparable<Key>, Value>{
    private ArrayList<Node> root;
    public binomialHeap(ArrayList<nodes> root){
        this.root = root;
    }
    public int size(){
        return root.size();
    }
    public Node get(int i){
        return root.get(i);
    }
    private void addToRoot(Node n){
        root.add(n);
    }

    private void totalSize(root){
        int s = 0;
        for(int i = 0; i < root.size(); i++){
            i.getNumChildren()
        }
    }
    private void addToRoot(int i, Node n){
        root.add(i, n);
    }

    public void merge(binomialHeap heap){
        for(int i =0; i<heap.size(); i++){
            Node temp = heap.get(i);
            for(int j =0; j<size(); j++)
            {
                if(temp.getKey().compareTo(root.get(j).getKey())==0 && temp.getNumChildren() <= root.get(j).getNumChildren()){
                    addToRoot(j, temp);
                }
            }
        }

    }


}
