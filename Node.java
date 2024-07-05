import java.util.ArrayList;

class Node {
    int value;
    ArrayList<Node> nodes = new ArrayList<>();

    @Override
    public String toString() {
        return value + "";
    }

    public Node(int value) {
        this.value = value;
    }

    public void add(Node node) {
        nodes.add(node);
    }

    static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.value);
            if (root.nodes.size() != 0) System.out.print(" (");
            for (int i = 0; i < root.nodes.size(); i++) {
                preOrder(root.nodes.get(i));
                if (i == root.nodes.size() - 1) System.out.print(")");
                else System.out.print(" ");
            }
        }
    }

    static void postOrder(Node root) {
        if (root != null) {
            if (root.nodes.size() != 0) System.out.print("(");
            for (int i = 0; i < root.nodes.size(); i++) {
                postOrder(root.nodes.get(i));
                if (i == root.nodes.size() - 1) System.out.print(") ");
                else System.out.print(" ");
            }
            System.out.print(root.value);
        }
    }

    public static void breadthFirst(Node[] roots) {
        System.out.print(roots[0] + " ");
        for (Node root : roots)
            if (root.nodes.size() != 0)
                for (Node root1 : root.nodes)
                    System.out.print(root1 + " ");
    }
}