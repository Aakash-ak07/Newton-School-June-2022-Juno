// Given a Binary Tree, find diameter of it. The diameter of a tree is the number of nodes on the longest path between two leaves in the tree. The diagram below shows two trees each with diameter nine, the leaves that form the ends of a longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes).

/*
// Information about the class Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

*/
public static int getDiameter(Node root) 
{
    if(root == null)
        return 0;
    
    int diamRoot = height(root.left) + height(root.right) + 1;
    int diamLeft = getDiameter(root.left);
    int diamRight = getDiameter(root.right);

    return Math.max(diamRoot, Math.max(diamLeft, diamRight));
}

public static int height(Node root)
{
    if(root == null)
        return 0;
    
    return Math.max(height(root.left), height(root.right)) + 1;
}

// Sample Input:
// 2
// 3
// 1 2 3
// 5
// 10 20 30 40 60

// Sample Output:
// 3
// 4

// Explanation:
// Test Case1: The tree is
// 1
// / \
// 2 3
// The diameter is of 3 length.
// Test Case2: The tree is
// 10
// / \
// 20 30
// / \
// 40 60
// The diameter is of 4 length.
