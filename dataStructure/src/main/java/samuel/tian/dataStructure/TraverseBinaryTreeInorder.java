package samuel.tian.dataStructure;

import java.util.Stack;

/**
 * Inorder traverse a binary tree without using recursion
 * 
 * @author Siyu Tian
 *
 */
public class TraverseBinaryTreeInorder {
	public static void main(String[] args) {
		// initiate the context
		Point p0 = new Point(0);
		Point p1 = new Point(1);
		Point p2 = new Point(2);
		Point p3 = new Point(3);
		Point p4 = new Point(4);
		Point p5 = new Point(5);
		Point p6 = new Point(6);
		Point p7 = new Point(7);
		Point p8 = new Point(8);
		Point p9 = new Point(9);
		p0.left = p1;
		p0.right = p2;
		p1.left = p3;
		p1.right = p4;
		p2.left = p5;
		p2.right = p6;
		p3.left = p7;
		p3.right = p8;
		p4.left = p9;
		inorder(p0);

	}
	
	public static void inorder(Point p){
		Stack<Point> stack = new Stack<Point>();
		Point current = p;
		boolean isDone = false;
		while(!isDone){
			if(current != null){
				stack.push(current);
				current = current.left;
			}
			else{
				if(!stack.isEmpty()){
					current = stack.pop();
					System.out.println(current);
					current = current.right;
				}
				else{
					isDone = true;
				}
			}
		}
	}
	
}
