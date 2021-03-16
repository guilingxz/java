
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Good gd1 = new Good("book1",14.5f,3);
       Good gd2 = new Good("book2",54.5f,1);
       Good gd3 = new Good("book3",31.5f,4);
       Good gd4 = new Good("book4",43.5f,2);
       Good gd5 = new Good("book5",21.5f,3);
       Customer cs = new Customer("zhang",1000);
       Cashier csh = new Cashier("li",100);
       cs.add(gd1);
       cs.add(gd2);
       cs.add(gd3);
       csh.cash(cs);
       csh.print(cs);
	}

}
