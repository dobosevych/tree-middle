/**
 * Created by cs.ucu.edu.ua on 22-Nov-16.
 */
public class Tree {
    Node root;
    Traverse trvrs;

    public Tree(Node root) {
        this.root = root;
    }
    public Node getRoot() {
        return root;
    }

    public void setTraverse(Traverse trvrs) {
        this.trvrs = trvrs;
    }

    public void makeTraverse() {
        trvrs.makeTraverse(this);
    }
}
