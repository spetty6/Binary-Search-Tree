/*  Date: 11/30/15
	Programmer: Samuel Petty
	Professor: D. Jugan
	Class: ITCS 2214-002 
	Summary: Program that allows the user to enter and search for strings.
*/
import java.util.*;
public class Node
{
private Node rightNode;//right child of the tree
private Node leftNode;//left child of the tree
private String word;
private int stringNum;
public Node(String w)
{
 word = w;
 stringNum = 1;
 leftNode = null;// sets left child to null.
 rightNode = null;//sets right child to null.
}
public void wordFrequency(){
 stringNum++;//counts the frequency of the strings/words, frequency increases by 1.   
}
public int getFrequency(){
return stringNum;//returns the frequency of the word.
}
//returns the word/string.
public String getString(){
return word;
}
public Node getLeftChild(){
return leftNode;//gets the left child of the tree.       
}
public Node getRightChild(){
return rightNode;//gets the right child of the tree.
}
//method that determines where to add the new node.
public int childrenNum(Node child){
int childNum = 0;
if(child.getLeftChild() != null){//check to see if left child is null.
childNum += 1 + childrenNum(child.getLeftChild());
}
if(child.getRightChild() != null){//check to see if right child is null
childNum += 1 + childrenNum(child.getRightChild());
}
return childNum;
}
//method that adds the nodes.
public void add (String wordAdd){
if (leftNode == null){
    leftNode = new Node(wordAdd);//if the left child is empty add a node.
}
else if(rightNode == null){
    rightNode = new Node(wordAdd);//if the right child is empty add a node.
}
else{
    if (childrenNum(leftNode) <= childrenNum(rightNode)){//comparison to determine where to add the node.
        leftNode.add(wordAdd);
    }else{
        rightNode.add(wordAdd);
    }
}
}
}

