package samuel.tian.hashcode;

public class WrappedString {
	public String str;
	WrappedString(){}
	WrappedString(String str){
		this.str=str;
	}
	@Override
	public int hashCode(){
		return str.hashCode();
	}
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof WrappedString)) return false;
		WrappedString ws=(WrappedString)obj;
		return str.equals(ws.str);
	}
}
