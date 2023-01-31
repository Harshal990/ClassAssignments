//Constructor chaining and constructor re-using 

package OopsConcept;

class User
{
	int userId;
	String userName,password,firstName,lastName,address;
	long phno;
	
	public User(int userId,String firstName,String lastName)
	{
		this.userId=userId;
		this.firstName=firstName;
		this.lastName=lastName;
	}


public User(int userId,String firstName,String lastName,String address,long phno)
{
	this(userId,firstName,lastName);
	this.address=address;
	this.phno=phno;
	}

public User(int UserId,String firstName,String lastName,String address,long phno,
		String userName,String password)
{
	this(UserId,firstName,lastName,address,phno);
	this.userName=userName;
	this.password=password;
}
	
public int getUserId() {
	return userId;
}

public String getUserName() {
	return userName;
}

public String getPassword() {
	return password;
}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public String getaddress() {
	return address;
}

public long getPhno() {
	return phno;
}

//void display()
//{
//System.out.println("ID:"+this.userId);
//System.out.println("first name: "+this.firstName);
//System.out.println("last name: "+this.lastName);
//System.out.println("address: "+this.address);
//System.out.println("contact no: "+this.phno);
//System.out.println("userName: "+this.userName);
//System.out.println("password: "+this.password);
		
}

public class ConstructorOverloadingEx {

	public static void main(String[] args) {
		User user1=new User(1, "sonali","mule","mumbai",
				9632587410l,"sonali","s123");
		
		System.out.println("ID:"+user1.getUserId());
		System.out.println("first name: "+user1.getFirstName());
		System.out.println("last name: "+user1.getLastName());
		System.out.println("address: "+user1.getaddress());
		System.out.println("contact no: "+user1.phno);
		System.out.println("userName: "+user1.getUserName());
		System.out.println("password: "+user1.getPassword());
		
System.out.println("===================================================");
		
		
		User user2=new User(2,"indra","Sharma","up",9925462340l);
		
		System.out.println("ID: "+ user2.getUserId()+"\nFirstName: "+user2.getFirstName()+
				"\nLastName: "+user2.getLastName()+"\nAddress: "+user2.getaddress()+
				"\nPhone No.:"+user2.getPhno());
		
	}

}
