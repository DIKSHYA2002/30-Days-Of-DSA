import java.util.LinkedList;
import java.util.Queue;

import Day3.BinaryNode;


public class avl {
    BinaryNode root;

    avl()
    {
        root = null;
    }

    //preorder // inrder same 

    // getHeight 

    public int getHeight(BinaryNode node)
    {
        if(node== null)
        {
            return 0;
        }
        return node.height;
    }

    private BinaryNode rotateRight( BinaryNode dsbn)
    {
        BinaryNode newnode = dsbn.left;
        dsbn.left = dsbn.left.right;
        newnode.right = dsbn;
        dsbn.height = 1+ Math.max(getHeight(dsbn.left) , getHeight(dsbn.right));
        newnode.height = 1+ Math.max(getHeight(newnode.left) , getHeight(newnode.right));
        return newnode;
    }


  private  BinaryNode rotateLeft( BinaryNode dsbn)
  {
    BinaryNode newnode = dsbn.right;
        dsbn.right = dsbn.right.left;
        newnode.left = dsbn;
        dsbn.height = 1+ Math.max(getHeight(dsbn.left) , getHeight(dsbn.right));
        newnode.height = 1+ Math.max(getHeight(newnode.left) , getHeight(newnode.right));
        return newnode;
  }


  public int getBalance(BinaryNode node)
  {
    if(node == null)
    {
        return 0;
    }

    return getHeight(node.left) - getHeight(node.right);

  }


  private BinaryNode insertNode(BinaryNode  node , int value)
   {
               if(node== null)
               {
                BinaryNode newNode = new BinaryNode();
                newNode.value = value;
                newNode.height = 1;
                return newNode;
               }
               else if( value< node.value)

               {
                node.left = insertNode(node.left, value);
                           }
                           else{
                            node.right = insertNode(node.right, value);
                           }

            return node;
                           

   }



   


}
