
public class BMW implements Automobile{

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 4000000;
	}
	public String toString() {
		return "BMW Color:" + getColor() + "\nBMW Model:" + getModel() + "\nBMW Price:" + getPrice();
	}
	
	

}
