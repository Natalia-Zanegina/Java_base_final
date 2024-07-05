public class Main {
    public static void main(String[] args) {
        Node[] nodes = new Node[10];
        for (int i = 0; i < nodes.length; i++)
            nodes[i] = new Node(i);

        nodes[0].add(nodes[1]);
        nodes[0].add(nodes[2]);

        nodes[1].add(nodes[3]);

        nodes[2].add(nodes[4]);
        nodes[2].add(nodes[5]);
        nodes[2].add(nodes[6]);

        nodes[3].add(nodes[7]);
        nodes[3].add(nodes[8]);

        nodes[4].add(nodes[9]);

        nodes[6].add(new Node(10));
        nodes[6].add(new Node(11));

        Node.preOrder(nodes[0]);
        System.out.println();
        Node.postOrder(nodes[0]);
        System.out.println();
        Node.breadthFirst(nodes);
    }
}