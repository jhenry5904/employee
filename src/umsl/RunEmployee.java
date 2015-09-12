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
public class RunEmployee 
{
    public static void main (String args[])
    {
        Employee Josh = new Employee("Josh","Admin",45);
        Josh.computeGross();
        Josh.computeTax();
        Josh.computeNet();
        Josh.computeNetperc();
        Josh.displayEmployee();
        
    }
    
}
