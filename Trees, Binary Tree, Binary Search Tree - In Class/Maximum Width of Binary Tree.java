// Given a Binary Tree, find the maximum width of it. Maximum width is defined as the maximum number of nodes in any level.

// For example, maximum width of following tree is 4 as there are 4 nodes at 3rd level.

//     1
//     / \
//     2 3
//     / \ / \
//     4 5 6 7
//     \
//     8

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


static int getMaxWidth(Node root)
{
    int max = 0, levelCount = 0;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty())
    {
        levelCount = q.size();
        max = Math.max(max, levelCount);
        for(int i = 0; i < levelCount; i++)
        {
            Node currentNode = q.remove();
            if(currentNode.left != null)
            {
                q.add(currentNode.left);
            }
            if(currentNode.right != null)
            {
                q.add(currentNode.right);
            }
        }
    }
    return max;
}


//2nd solution

static int getMaxWidth(Node root)
{
    LinkedList<Node> list = new LinkedList<>();
    int width = 0;

    list.addLast(root);

    while(list.size() != 0)
    {
        int size = list.size();
        width = Math.max(width, size);

        while(size-- > 0)
        {
            Node del = list.removeFirst(); 

            if(del.left != null)
            list.addLast(del.left);
        
            if(del.right != null)
            list.addLast(del.right);
        }
    }
    return width;
}


// Sample Input:
// 2
// 3
// 1 2 3
// 5
// 10 20 30 40 60

// Sample Output:
// 2
// 2

// Explanation:
// Testcase1: The tree is
// 1
// / \
// 2 3
// The second level has 2 nodes and hence the width is 2.
// Testcase2: The tree is
// 10
// / \
// 20 30
// / \
// 40 60
// Both second and third level have 2 nodes and hence max width is 2.
