
public class Maruti implements Automobile{

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "maruti -swift";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 700000;
	}

	@Override
	public String toString() {
		return"Maruti Color:" + getColor() + "\nMaruti Model:" + getModel() + "\nMaruti Price:" + getPrice();
	}
	
	

}
