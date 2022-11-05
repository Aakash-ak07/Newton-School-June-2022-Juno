
import java.util.*;

public class BoundaryTraversal {

    private static boolean isLeaf(Node node){
        return (node.left == null) && (node.right == null);
    }

    private static void doLeftHandTraversal(Node node, List<Integer> result){
        Node curr = node.left;
        while(curr != null){
            if(isLeaf(curr) == false) result.add(curr.data);
            if(curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }


    private static void doRightHandTraversal(Node node, List<Integer> result){
        Node curr = node.right;
        List<Integer> revList = new ArrayList<>();
        while(curr != null){
            if(isLeaf(curr) == false) revList.add(curr.data);
            if(curr.right != null) curr = curr.right;
            else curr = curr.left;
        }

        for(int i = revList.size()-1; i>= 0; i--){
            result.add(revList.get(i));
        }
    }


    static void addLeaves(Node node, List<Integer> result){
        //base condition//
        if(isLeaf(node)){
            result.add(node.data);
            return;
        }

        if(node.left != null) addLeaves(node.left, result);
        if(node.right != null) addLeaves(node.right, result);
    }


    static List<Integer> printBoundary(Node node){
        List<Integer> result = new ArrayList<>();

        if(isLeaf(node) == false) result.add(node.data);

        //Left Hand Traversal//
            doLeftHandTraversal(node, result);
        //Leaf Node//
            addLeaves(node, result);
        //Right Hand Traversal
            doRightHandTraversal(node, result);

            return result;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> answer = printBoundary(root);

        System.out.println("Boundary Traversal :: ");

        for(int i = 0; i < answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }
    }
}
