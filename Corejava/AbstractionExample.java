package corejava1;

public abstract class AbstractionExample {

	//fields  
	private int id;
	private String name;
	private String Address;
	//creating paramiterized constructor
	public AbstractionExample(int id, String name, String address) {
		
		this.id = id;
		this.name = name;
		this.Address = address;
	}
	// create a method 
		public void mailcheck()
		{
			System.out.println("mail check to :"+getName());
			}

	
@Override
	public String toString() {
		return "AbstractionExample [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	//create geters and  seaters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}

