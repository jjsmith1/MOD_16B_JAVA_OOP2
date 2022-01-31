package Pet;

public class Pet {
	private String name;
	private int age;
	private String location;
	private String type;
	
	public Pet() {
		name = "Gill";
		age = 3;
		location ="Erwin";
		type = "Dog";
	}

	public Pet(String name, int age, String location, String type) {
		this.name = "Ace";
		this.age = 5;
		this.location = "Greensboro";
		this.type = "Fish";
			
	}

public String getName() {
	return name;

}

public int getAge() {
	return age;
}
public String getType() {
	return type;
}
 public void setAge(int age) {
	 this.age = age;
 }

 public void setLocation(String location) {
	 this.location = location;
 }
}