package Day3;

/**
 * BinarySearchTree
 */
public class BinarySearchTree {

    BinaryNode root;
    BinarySearchTree()
    {
        root = null;
    }

    //insert method 

    private BinaryNode insert(BinaryNode currNode , int value)
    {

        if(currNode== null)
        {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            return newNode;
        }

        else if(value<= currNode.value)
        {
            currNode.left = insert(currNode.left , value);
            return currNode;
        }
        else{
            currNode.right = insert(currNode.right , value);

            return currNode;
        }

    }
 
     void insert(int value)
     {
       root =  insert(root , value );
     }



     //postorder 
     void postOrder( BinaryNode root)
     {
        if(root== null)
        return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);

     }

     void search(int value)
     {
        System.out.println(search(root, value)== null ?"found" : "not found");
     }


     BinaryNode search( BinaryNode root , int value)
     {
        if(root.value== value)
        {
            return root;
        }
        else if(root.value > value)
        {
           return search(root.left, value);
           
       }
       else {
         return search(root.right , value);
       
       }
     }

     public static BinaryNode minimumNode(BinaryNode root)
     {
        if(root.left == null)
        {
            return null;
        }
        else
        {
            return minimumNode(root.left);
        }
     }
    }

