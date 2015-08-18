package samuel.tian.dataStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Breadth traverse: level by level
 * Non-recursive traversal
 * 
 * @author Siyu Tian
 *
 */
public class TraverseBinaryTree {

	public static void main(String[] args) {
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
		traverseBinaryTree(p0);
	}
	
	public static void traverseBinaryTree(Point root){
		List<Point> list = new ArrayList<Point>();
		List<Point> tmpList = new ArrayList<Point>();
		list.add(root);
		while(!list.isEmpty()){
			for(Point p : list){
				System.out.println(p);
				if(p.left != null){
					tmpList.add(p.left);
				}
				if(p.right != null) {
					tmpList.add(p.right);
				}
			}
			list.clear();
			list.addAll(tmpList);
			tmpList.clear();
		}
	}


}
