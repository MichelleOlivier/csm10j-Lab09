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
public class CarB implements Drivable
{
    private boolean started = false;
    
    public void Drive()
    {
       if (started)
           System.out.println("Driving vehicle");
       else 
           System.out.println("Start the vehicle first");
    }
    public void Start()
    {
        System.out.println("Starting vehicle");
        started = true;
    }
}
