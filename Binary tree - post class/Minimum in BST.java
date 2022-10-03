// Given a Binary Search Tree. The task is to find the minimum element in this given BST. If the tree is empty, there is no minimum element, so print -1 in that case.

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
static int minValue(Node node)
{
  if(node == null)  return -1;
  while(node.left != null)  
    node = node.left;
  
  return node.data;
}

// 2nd solution
----------------
static int minValue(Node node)
{
  int val = node.data;
  while(node.left != null)
  {
    val = node.left.data;
    node = node.left;  
  }
  return val;
}


// Input:
// 2
// 5 4 6 3 N N 7 1
// 9 N 10 N 11

// Output:
// 1
// 9

// Explanation:
// Testcase 1: We construct the following BST by inserting given values one by one in an empty BST.
// 5
// / \
// 4 6
// / \
// 3 7
// /
// 1

// The minimum value in the given BST is 1.
// Testcase 2: We construct the following BST by inserting given values one by one in an empty BST.
// 9
// \
// 10
// \
// 11
// The minimum value in the given BST is 9.
