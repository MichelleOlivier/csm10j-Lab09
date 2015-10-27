/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package interfaces;

/**
 *
 * @author Michelle
 */
public class ConvertibleB extends CarB implements Drivable
{
   private boolean convertibleTop = true;
    
    public void PutTopUp()
    {
        if (convertibleTop)
            System.out.println("Top is already up");
        else
        {   
            System.out.println("Putting top up");
            convertibleTop = true;
        }
    } 
    public void PutTopDown()
    {
        if (convertibleTop)
        {
            System.out.println("Putting top down");
            convertibleTop = false;
        }
        else
            System.out.println("Top is already down");
         
        
    }
}
