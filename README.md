# Binary-Search-Tree
/*  Date: 11/30/15
	Programmer: Samuel Petty
	Professor: D. Jugan
	Class: ITCS 2214-002 
	Summary: Program that allows the user to enter and search for strings.
*/
import java.util.*;
public class BinarySearchTree
{
    private Node root;//Binary Tree root.
    public BinarySearchTree(){//sets root value of the tree to null.
     root = null; 
    }
    public boolean isEmpty()//checks to see if there is a root node.
    {
        return root == null;
    }
    //adds nodes to the tree.
    public void insert(String a)
    {
    Node same;
    if(isEmpty())
    root = new Node(a);//node added to root if root is empty.
    else if((same = checkChild(root, a)) == null)//traverses the tree to see if a new node should be added.
    
    root.add(a);
    else
    same.wordFrequency();
    }
    //searches through the tree.
    public void search(String s){
     Node wordInfo;
     if((wordInfo = checkChild(root, s)) == null)//determines which message the user will see after search.
     System.out.println("The word (" + s + ") was not found.");//message printed if the word cannot be found
     else
     System.out.println("The word (" + wordInfo.getString() + ") was found: " + (wordInfo.getFrequency()) +" times");
     //message printed when the word is found.
    } 
    //method that searches the tree using recursive calls.
    public Node checkChild(Node child, String info)
    {
      Node wordInfo = null;
     if(child != null){
     if((child.getString()).equals(info))
     return child;
     if((wordInfo = checkChild(child.getLeftChild(), info)) != null){
        return wordInfo;
     }
     return checkChild(child.getRightChild(), info);
        }
      return wordInfo;
    }
    public void preOrder(Node child){//Brings in a Node from the tree.
    if(child != null){
    System.out.println(child.getString() + " ");
    preOrder(child.getLeftChild());
    preOrder(child.getRightChild());
    }
    }
    public void printPreOrder(){//prints the Pre Order to the user..
    System.out.println();
    preOrder(root);

    }
    public void inOrder(Node child) {
    if(child != null){
    inOrder(child.getLeftChild());
    System.out.println(child.getString() + " ");
    inOrder(child.getRightChild());
    }
    }
    public void printInOrder(){//prints In Order to the user.
    System.out.println();
    inOrder(root);
    }
    public void postOrder(Node child)
    {
    if(child != null){
    postOrder(child.getLeftChild());
    postOrder(child.getRightChild());
    System.out.println(child.getString() + " ");
    }
    }
    public void printPostOrder(){//Prints Post Order to the user.
    System.out.println();
    postOrder(root);
    }
    }
    
