//24-11-2022


package OopsConcept;

public class BankAggregation {
	
		String bankname, location;
		long accno;

		public BankAggregation(String bankname, String location, long accno) {
			this.bankname = bankname;
			this.location=location;
			this.accno = accno;
		}
		
	

	public String getBankname() {
			return bankname;
		}


	public String getLocation() {
			return location;
		}


	public long getAccno() {
			return accno;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAggregation obj = new BankAggregation("Nagpur","SBI",1001);
		System.out.println("Bank Name: "+obj.getBankname());
		System.out.println("Branch Name: "+obj.getLocation());
		System.out.println("AC Number: "+obj.getAccno());
	}

}









































/*
package OopsConcept;

public class BankAccount {
String bankName;
float accountNo;
String branch;

public BankAccount(String bankname,float accountNo,String branch)
{
	super();
	this.bankName= bankName;
	this.accountNo= accountNo;
	this.branch= branch;
}

public String getBankName() {
	return bankName;
}


public float getAccountNo() {
	return accountNo;
}


public String getBranch() {
	return branch;
}

@Override
public String toString() {
	StringBuilder builder= new StringBuilder();
	builder.append("BankAccount {bankName=").append(bankName).append(",accountNo=").append
	.append


}

}
*/