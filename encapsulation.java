package FileOperation;

public class encapsulation 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		bankacconut bac=new bankacconut();
		bac.setAccno(1234);

	}

}

class bankacconut
{ 
private int accno;
private String ifsc;
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getIfsc() {
	return ifsc;
}
public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}

}