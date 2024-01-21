 package Day2;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryTree {
    BinaryNode root;

    public BinaryTree()
    {
        this.root = null;
    }
    
    void preOrder(BinaryNode node)
    {
        if(node == null)
        {
            return;
        }  
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
   
    void InOrder(BinaryNode node)
    {
        if(node == null)
        {
            return;
        }  
        InOrder(node.left);
        System.out.println(node.value + " ");
        InOrder(node.right);
    }

    void postOrder(BinaryNode node)
    {
        if(node == null)
        {
            return;
        }  
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");
    }


    void LevelOrderTraversal()
    {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.value + " ");
            if(presentNode.left != null)
            {
                queue.add(presentNode.left);
            }
                if(presentNode.right != null)
            {
                queue.add(presentNode.right);
            }

            

        }


    }
    

}