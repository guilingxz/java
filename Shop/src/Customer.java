
public class Customer {
	String strName;
	float fMoney;
	ShopCar sc;
	public Customer(String inName,float inMoney)
	{
		this.strName = inName;
		this.fMoney = inMoney;
		this.sc = new ShopCar();
	}
	public void add(Good gd)
	{
		this.sc.add(gd);
	}
	public void pay(float money)
	{
		this.fMoney -= money;
		System.out.println("Costomer:" + this.fMoney);
	}

}