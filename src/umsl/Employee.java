/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl;

/**
 *
 * @author Josh
 */
public class Employee
{
	/*********************
	     Attributes
	*********************/
	float rate;
	float taxrate;
	int hours;
	float gross;
	float ot; 
	float tax;
	float net;
	float net_percent;
	String JobCode;
	String Name;

	//End Attributes
	
	/********************
	     Methods
	********************/

    /**
     * Methods
     * @param n
     * @param jc
     * @param h
     */
    public Employee(String n, String jc, int h)
        {
		rate=30.0f;
		taxrate=0.2f;
		hours=h;
		Name=n;
		JobCode=jc;
	}

	public void computeGross() 
        { 
		if(hours<40)
			gross=rate*hours;
		else gross=(40*rate)+computeOT();
	}

	private float computeOT()
        {
		if(JobCode.equals("Admin"))
			ot = (hours-40)*50.0f;
		else
			 ot = (hours-40)*40.0f;
		return(ot);
	}	

	public void computeTax() 
        { 
		tax=gross*taxrate;
	}

	public void computeNet() 
        { 
		net=gross-tax;
	}

public void computeNetperc() 
{ 
	net_percent=(net/gross)*100;
}

public void displayEmployee() 
{
	System.out.println("Name: " + Name);
	System.out.println("Job Code: " + JobCode);
	System.out.println("Hours: " + hours);
	System.out.println("Rate: " + rate);
	System.out.println("Gross: " + gross);
	System.out.println("Over Time Earnings: " + ot);
	System.out.println("Net: " + net);
	System.out.println("Net%: " + net_percent + "%");
}
//End Methods

} // End class OOEmployee1	

