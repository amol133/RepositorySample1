package day10.Encapsulation;

class Account {
	private long acc_no;
	private float amount;
	
	public long getAcc_No() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		 this.acc_no=acc_no;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount=amount;
	}
}
public class Encapsulation1 {

	public static void main(String[] args) {
		Account e1=new Account();
		System.out.println(e1.getAcc_No());
		System.out.println(e1.getAmount());
            e1.setAcc_no(1234);
            e1.setAmount(130000);
            System.out.println(e1.getAcc_No());
    		System.out.println(e1.getAmount());
            

	}

}
