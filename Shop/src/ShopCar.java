import java.util.ArrayList;
import java.util.List;

public class ShopCar {
	List<Good> liCar;
	public ShopCar()
	{
		this.liCar = new ArrayList<Good>();
	}
	public void add(Good gd) {
		this.liCar.add(gd);
//		this.liCar.re
		
	}
	public float getSum() {
		float sum = 0;
		for(int i=0;i<this.liCar.size();i++)
		{
			Good temp;
			temp = this.liCar.get(i);
			sum += temp.fPrice * temp.iCount;
		}
		return sum;
	}

}
