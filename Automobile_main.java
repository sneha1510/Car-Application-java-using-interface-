import java.util.*; 
public class Automobile_main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Automobile m=null;
		int ch;
		do {
		System.out.println("1-Car\n2-Bike");
		System.out.println("Enter your choice..");
		ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("1-Maruti\n2-BMW");
			ch=sc.nextInt();
			if(ch==1)
			{
		   m=new Maruti();
		   display(m);
			}
			else if(ch==2)
			{
				m=new BMW();
				display(m);
			}
		}
		else if(ch==2)
		{
			System.out.println("1-Honda\n2-Activa");
			ch=sc.nextInt();
			if(ch==1)
			{
				m=new Honda();
				if(m instanceof Automobile)
				{
					Bike b=(Bike) m;
					display(m);
					//System.out.println("No. of CC"+b.getcc());
				}
			}
			if(ch==2)
			{
				m=new Activa();
				if(m instanceof Automobile)
				{
					Bike b=(Bike) m;
					display(m);
					//System.out.println("No. of CC"+b.getcc());
				}
			}
		}
		
		System.out.println("Do you want to continue press 1..");
		ch=sc.nextInt();
		}while(ch==1);
		System.out.println("----------Thank You-------------");
		

	}
	/* public static void accept()
	    {
	    	
	    }*/
	
    public static void display(Automobile a)
    {
    	System.out.println(a);
    }
}
