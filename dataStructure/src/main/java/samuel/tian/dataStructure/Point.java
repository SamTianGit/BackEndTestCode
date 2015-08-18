package samuel.tian.dataStructure;

public class Point {
	Integer value;
	Point left;
	Point right;
	public Point(Integer value){
		this.value = value;
	}
	public String toString(){
		return this.value.toString();
	}
}
