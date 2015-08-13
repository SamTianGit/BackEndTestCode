package samuel.tian.immutableClass;
/*
 How to make a class immutable(value cannot be changed)
 1.class must be final (it will not be extended by a mutable subclass)
 2.all fields are private
 3.only getters,no setters
 4.provides constructor to initialize fields.
 */
public final class Person {
	private String name;
	public Person(){};
	public Person(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public Person addPrefix(String prefix){
		return new Person(prefix+" "+name);
	}
	@Override
	public String toString(){
		return name;
	}
	
}
