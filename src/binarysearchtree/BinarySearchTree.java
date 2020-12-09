
package binarysearchtree;

import java.util.Scanner;
import java.util.ArrayList;

public class BinarySearchTree 
{

    public static void main(String[] args) 
    {
        Node root=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please, Enter the redundancy ratio:-");
        double r = sc.nextDouble();
        ArrayList<Integer>list=new ArrayList<Integer>();
        System.out.println("Please, Enter the number:-");
        int a=sc.nextInt();
        if (a!=-1)
        {
            list.add(a);
            double y =list.size();
            root =new Node (a);
            Insert(root,a);
            while(compare(r,root,y)==false)
            {
                System.out.println("Please, Enter the next number:-");
                int b=sc.nextInt();    
                if (b==-1)
                {
                    System.out.println("ratio="+list.size()+"/"+GetNodes(root)+"="+Calculate(root,list.size())+"\n"+"only few repetitions");
                    break;
                    
                }
                list.add(b);
                double k =list.size();
                Insert(root,b);
                double d=list.size();
                Calculate(root , d);
                if (compare(r,root,k)==true)
                {
                    System.out.println("ratio="+k+"/"+GetNodes(root)+"="+Calculate(root,k)+"\n"+"many repetitions");
                    break;
                }    
            }    
            
        }
        else
            System.out.println("ratio="+list.size()+"/"+GetNodes(root)+"="+Calculate(root,list.size())+"\n"+"only few repetitions");
        
    }
    
    
    public static Node Insert (Node root , int number)
    {
        if (root == null)
            return new Node(number);
       
        if (number < root.getNumbers())
            root.left=(Insert(root.left , number));
          
        if (number > root.getNumbers())
            root.right=(Insert(root.right , number));
        return root;
    }
   
    public static int GetNodes(Node root)
    {
        
        if(root==null)
            return 0;
        else
            return(GetNodes(root.left)+1+GetNodes(root.right));
    }
    
    
     public static double Calculate(Node root , double d)
    {
        double R=d/GetNodes(root);
        return R;
    }
    
    public static boolean compare (double r , Node root , double y )
    {
        if (Calculate(root, y)>=r)
            return true;
        else
            return false;
        
    }
    
}
