//24-11-2022


//package OopsConcept;
//
//class UserDetails
//{
//	int id;
//	String name;
//	long phoneNo;
//	
//BankAgg bankAgg; //entity reference i.e aggregation
//
//public UserDetails(int id, String name, long phoneNo, BankAgg bankAgg) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.phoneNo = phoneNo;
//	this.bankAgg = bankAgg;
//}
//
//public int getId() {
//	return id;
//}
//
//public String getName() {
//	return name;
//}
//
//public long getPhoneNo() {
//	return phoneNo;
//}
//
//public BankAgg getBankAgg() {
//	return bankAgg;
//}
//
//}
//
//public class AggregationDemo {
//public static void main(String args [])
//{
//	BankAgg acc1 = new BankAgg("Ulwe","BOI",8899);
//	UserDetails obj = new UserDetails(55,"Swastika",9987293710l,acc1);
//	
//	System.out.println("ID: "+obj.getId());
//	System.out.println("Name: "+obj.getName());
//	System.out.println("Phone no : "+obj.getPhoneNo());
//	
//	System.out.println("Bank name: "+obj.getBankAgg().getBankName());
//	System.out.println("Branch name: "+obj.getBankAgg().getBranchName());
//	System.out.println("Account no: "+obj.getBankAgg().getAccountNo());
//}
//}
























































package OopsConcept;


class UserDetails{
	int id;
	String name;
	long phno;
	
BankDetails bankdetails;   // entity reference

   public UserDetails(int id, String name, long phno,BankDetails bankdetails) {
	   super();
	   this.id = id;
	   this.name= name;
	   this.phno=phno;
	   this.bankdetails = bankdetails;
   }

public int getId() {
	return id;
}




public String getName() {
	return name;
}



public long getPhno() {
	return phno;
}


public BankDetails getBankdetails() {
	return bankdetails;
}

@Override
public String toString() {
	return "UserDetails [id=" + id + ", name=" + name + ", phno=" + phno + ", bankdetails=" + bankdetails + "]";
}


   
	
}

public class AggregationDemo {
	
	public static void main(String[]args) {
	
	BankDetails acc1 = new BankDetails("sbi", "pube", 12345);
	BankDetails acc2 = new BankDetails("axis", "Mumbai",14578);
	
	UserDetails Gouri = new UserDetails(10, "Gouri", 1235, acc2 );  // object for the userdetail class
	
	System.out.println("ID:" + Gouri.getId());
	System.out.println("Bank Name:"+ Gouri.getBankdetails().getBankname());
	
	}

}

















































/*
package OopsConcept;

class UserDetails
{
	int id;
	String name;
	long phno;
	
BankAccount bankAccount;	//entity reference


public UserDetails(int id,String name,long phno, BankAccount bankAccount)	{
	super();
	this.id=id;
	this.name=name;
	this.phno=phno;
	this.bankAccount=bankAccount;	
}


public int getId() {
	return id;
}

public String getName() {
	return name;
}

public long getphno() {
	return phno;
}

public BankAccount getBankAccount() {
	return bankAccount;
}


@Override
public String toString() {
	return "UserDetails [id=" + id + ", name=" + name + ", phno=" + phno + ", bankAccount=" + bankAccount + "]";
}

public class AggregationDemo {
	
	public static void main(String[]args) {
	
	BankAccount acc1 = new BankAccount(14,"Shreesha",7894561230l,"SBI");
	BankDetails acc2 = new BankDetails(47,"axis", "Mumbai",14578);
	
	UserDetails Gouri = new UserDetails(10, "Gouri", 1235, acc2 );  // object for the userdetail class
	
	System.out.println("ID:" + Gouri.getId());
	System.out.println("Bank Name:"+ Gouri.getBankdetails().getBankname());
	
	}




}



}
	
	*/
	
	
	
	
	
	
	
	
	
