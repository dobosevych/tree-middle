/**
 * Created by cs.ucu.edu.ua on 22-Nov-16.
 */
public class Main {
    public static void main(String[] args) {
        Node nd = new Node(1);
        Node nd1 = new Node(2);
        Node nd2 = new Node(3);
        Node nd4 = new Node(4);
        nd2.setLeft(nd4);
        nd.setLeft(nd2);
        nd.setRight(nd1);
        Tree tr  = new Tree(nd);
        DFS trvrs  = new DFS();
        tr.setTraverse(trvrs);
        tr.makeTraverse();
    }
}
