
public class Honda implements Bike,Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Suzuki";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 48000;
	}
	

	@Override
	public String toString() {
		return "Honda Color:" + getColor() + "\nHonda Model:" + getModel() + "\nHonda Price:" + getPrice()
				+ "\nHonda cc:" + getcc();
	}

	@Override
	public int getcc() {
		// TODO Auto-generated method stub
		return 150;
	}

}
