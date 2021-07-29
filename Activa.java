
public class Activa implements Bike,Automobile
{

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "white";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Activa";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 60000;
	}

	@Override
	public int getcc() {
		// TODO Auto-generated method stub
		return 120;
	}
	
	public String toString() {
		return "Activa Color:" + getColor() + "\nActiva Model:" + getModel() + "\nActiva Price:" + getPrice()
				+ "\nActiva cc:" + getcc();
	}

}
