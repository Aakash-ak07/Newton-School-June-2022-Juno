// Given two binary trees, the task is to find if both of them are identical or not.
// Note: Here identical means exactly same.

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
public static boolean isIdentical(Node root1, Node root2)
{
    if(root1 == null && root2 == null)
    {
        return true;
    }
    if((root1 == null && root2 != null)||(root1 != null && root2 == null))
    {
        return false;
    }
    if(root1.data != root2.data)
    {
        return false;
    }
    boolean checkLeft = isIdentical(root1.left, root2.left);
    boolean checkRight = isIdentical(root1.right, root2.right);

    return checkLeft && checkRight;
}

//   Sample Input:
//   1
//   / \
//   2 3

//   1
//   / \
//   2 3

//   Sample Output:
//   1

//   Sample Input:-
//   1
//   / \
//   2 3
//   1
//   / \
//   3 2

//   Sample Output:-
//   0

//   Explanation:
//   Test case 1: There are two trees both having 3 nodes and 2 edges, both trees are identical having the root as 1, left child of 1 is 2 and right child of 1 is 3.
