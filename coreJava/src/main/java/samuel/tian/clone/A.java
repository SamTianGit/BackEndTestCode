package samuel.tian.clone;
/*
 * Object.clone() only shallow copies all the fields, 
 * if it only has primitive type member variable and immutable member variable, it is ok.
 * otherwise one has to manually clone other fields.
 */
public class A implements Cloneable {  
	String name;
	int[] array;
	@Override
	public A clone(){
		A o=null;
		try{
			o=(A)super.clone();
			o.array=(int[])array.clone();    //deep clone array
		}catch(Exception e){
			e.printStackTrace();
		}
		return o;
	}
}
