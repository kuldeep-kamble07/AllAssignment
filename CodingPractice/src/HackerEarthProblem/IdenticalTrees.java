package HackerEarthProblem;

public class IdenticalTrees {
    Node root1, root2;
        boolean identicalTrees(Node a, Node b){
            if(a == null && b == null){
                
            }
        }

    public static void main(String[] args) {
        IdenticalTrees tree = new IdenticalTrees();

        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);


        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root1.left.right = new Node(5);

    }
}
