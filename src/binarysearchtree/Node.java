
package binarysearchtree;

public class Node 
{
    int numbers;
    Node left = null;
    Node right = null;
    Node next;
    
    public Node (int numbers)
    {
        this.numbers = numbers;
    }
    
    public void setLeft (Node x)
    {
        left = x;
    }
    
    public void setRight (Node x)
    {
        right = x;
    }
    
    public void setNumbers (int n)
    {
        numbers = n;
    }
    
    public int getNumbers ()
    {
        return numbers;
    }
    
    public Node getLeft()
    {
        return left;
        
    }
    
    public Node getRight()
    {
        return right;
    }
 
}
