// Given a binary tree, check if the tree can be folded or not. A tree can be folded if left and right subtrees of the tree are mirror images of each other. An empty tree is considered as foldable.
// Consider the below trees:
// (a) and (b) can be folded.
// (c) and (d) cannot be folded.
// Sample Input:
// 2
// 5
// 10 7 15 N 9 11 N
// 5
// 10 7 15 5 N 11 N

// Sample Output:
// Yes
// No

/*
// Information about the class Node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
static boolean isFoldable(Node node)
{
    boolean ans;
    if(node == null)    return true;

    mirrorTree(node.left);
    ans = sameTree(node.left, node.right);
    mirrorTree(node.right);

    return ans;
} 
static boolean sameTree(Node a, Node b)
{
    if(a == null && b == null)
        return true;
    
    if(a != null && b != null && sameTree(a.left, b.left) && sameTree(a.right, b.right))
        return true;
    
    return false;
}
static void mirrorTree(Node root)
{
    if(root == null)
        return;
    else
    {
        Node temp;
        mirrorTree(root.left);
        mirrorTree(root.right);

        temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
