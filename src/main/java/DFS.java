import java.util.Stack;

/**
 * Created by cs.ucu.edu.ua on 22-Nov-16.
 */
public class DFS implements Traverse {
    public void makeTraverse(Tree tr) {
        Node rt = tr.getRoot();
        Stack<Node> stck = new Stack<Node>();
        stck.push(rt);
        while (!stck.isEmpty()) {
            rt = stck.pop();
            System.out.println(rt.getValue());
            if (rt.getRight() != null) {
                stck.push(rt.getRight());
            }
            if (rt.getLeft() != null) {
                stck.push(rt.getLeft());
            }
        }
    }
}
