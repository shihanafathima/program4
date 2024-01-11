package java_program;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;

public class TrainReservation {
	String tn,dpg,name,from,to,ticketno;
	DataInputStream tr=new DataInputStream(System.in);
	void Information() throws Exception
	{
		System.out.println("Enter the train number and name:");
		tn=tr.readLine();
		System.out.println("Enter the Data of journey:");
		dpg=tr.readLine();
		System.out.println("Enter the station from:");
		from=tr.readLine();
		System.out.println("Enter the station to:");
		to=tr.readLine();
		System.out.println("Enter the phone number:");
		long ph=Long.parseLong(tr.readLine());
		
	}
	void details()throws Exception
	{
		int amt=0;
		System.out.println("Enter the number of person:");
		int j=Integer.parseInt(tr.readLine());
		for(int i=1;i<=j;i++)
		{
			System.out.println("Enter the Name:");
			name=tr.readLine();
			System.out.println("Enter the Age:");
			int age=Integer.parseInt(tr.readLine());
			System.out.println("Enter the Gender:");
			String g=tr.readLine();
			System.out.println("Enter the Aadhar card number:");
			int aadharno=Integer.parseInt(tr.readLine());
		System.out.println("Select the class:1->First class2->Second class3->Sleeper");
		int cl=Integer.parseInt(tr.readLine());
		if(cl==1)
		{
			amt=75;
			System.out.println("First class");
		}
		else if (cl==2)
		{
			amt=65;
			System.out.println("Second class");
		}
		else if (cl==3)
		{
			amt=150;
			System.out.println("Select the seat:1->Upper 2->Middle 3->lower");
			int seat=Integer.parseInt(tr.readLine());
			System.out.println("Sleeper");
			if(seat==1)
			{
				System.out.println("Upper berths");
			}
			else if(seat==2)
			{
				System.out.println("Middle berths");
			}
			else if(seat==3)
			{
				System.out.println("Lower berths");
			}
		}
		}
		int pr=j*amt;
		System.out.println("Price = "+pr);
	}
	public static void main(String[] args) throws Exception {
		TrainReservation2 tr2=new TrainReservation2();
		tr2.Information();
		tr2.details();
		tr2.random();

	}

}
class TrainReservation2 extends TrainReservation
{
	void random()
	{
		int ticketno;
		long pnr;
		Random rn=new Random();
		ticketno=Math.abs(rn.nextInt());
		pnr=Math.abs(rn.nextInt());
		System.out.println("Ticket number : "+ticketno);
		System.out.println("PNR number : "+pnr);
	}
}
////train ticket reservation and PNR number generation