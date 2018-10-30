import java.util.ArrayList;

public class binomialHeap <Key extends Comparable<Key>, Value>{
    private ArrayList<Node> root;
    public binomialHeap(ArrayList<Node> root){
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
    private void deleteFromRoot(int i){
        root.remove(i);
    }
    /*private void totalSize(ArrayList<Node> root){
        int s = 0;
        for(int i = 0; i < root.size(); i++){
            i.getNumChildren();
        }
    }*/
    private void addToRoot(int i, Node n){
        root.add(i, n);
    }

    private void put(Node n){
        ArrayList<Node> nodeArr = new ArrayList();
        nodeArr.add(n);
        binomialHeap temp = new binomialHeap(nodeArr);
        merge(temp);

    }

    public String toString(){
        String str = new String();
        for(int i =0; i<root.size(); i++){
           // s+=root.get(i).get
            //if(root.get(i).getNumChildren == 0){
                str+=root.get(i);
            //}
            str += recString(str, root.get(i));//assuming that this works
        }
    }

    private String recString(String s, Node n){
        for(int i = 0; i<n.getNumChildren(); i++){
            s+=n.getChildConnection(i);
            s+=recString(s,n.getChildConnection(i));
        }
        return s;
    }

    public void merge(binomialHeap heap){
        int i = 0;
        int j = 0;
        binomialHeap temp = new binomialHeap(null);
        while(i<heap.size()&&j<root.size()){
            //check that heap.get(i) doesn't = null and same for root
           if(heap.get(i)!=null&&root.get(j)!=null) {
               if (heap.get(i).getNumChildren()==root.get(j).getNumChildren()) { //same order
                   if(heap.get(i).getKey().compareTo(root.get(j).getKey())>=0){ //comparing the actual keys
                       temp.addToRoot(root.get(j));
                       j++;
                   }
                   else{
                       temp.addToRoot(heap.get(i));
                       i++;
                   }


               }
               else if(heap.get(i).getNumChildren()>root.get(j).getNumChildren()) {
                   temp.addToRoot(root.get(j));
                   j++;
               }
               else {
                    temp.addToRoot(heap.get(i));
                    i++;
               }
           }
           else if(heap.get(i)==null){
               temp.addToRoot(root.get(j));
               j++;
           }
           else if(root.get(j)==null){
               temp.addToRoot(heap.get(i));
               i++;
           }
        }
        //added trees to a temp heap

        //now we combine the trees with the same order

        for(int k = 0; k<temp.size(); k++){
            if(temp.get(k).getNumChildren() == temp.get(k++).getNumChildren()){
                Node t1 = temp.get(k);
                Node t2 = temp.get(k++);
                temp.deleteFromRoot(k++);
                temp.deleteFromRoot(k);
                t1.addChild(t2);
                Node t3 = t1;
                temp.addToRoot(k, t3);
            }
        }
    }


}
