
public class Cashier {
	String strName;
	float fMoney;
	public Cashier(String inName,float inMoney)
	{
		this.strName = inName;
		this.fMoney = inMoney;
	}
	public void cash(Customer cs)
	{
		float sum = 0;
		sum = cs.sc.getSum();
		cs.pay(sum);
		this.fMoney += sum;
		System.out.println("Cashier:" + this.fMoney);
	}
	public void print(Customer cs)
	{
		for(int i =0;i<cs.sc.liCar.size();i++)
		{
			Good temp;
			temp = cs.sc.liCar.get(i);
			System.out.println("name:" + temp.strName);
		}
	}

}
