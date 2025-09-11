import java.util.Scanner;

public class Microwave
{
    //attributes
    private String brand;
    private int maxPower;

    public Microwave (String manufacturer, int power)
    {
        brand = manufacturer;
        maxPower = power;
    }

    //microwave behaviours
    public void spin()
    {
        System.out.println("Spinning");
    }
    public void spin(boolean spinVal) //same name is okay with different parameters
    {
        if (spinVal) 
        {
            System.out.println("Spinning");
        }
    }
    public void cook()
    {
        System.out.println("Cooking at " + maxPower + " W");
        spin();
        beep();
    }
    public void cook(int seconds, int power)
    {
        System.out.println("Cooking for " + seconds + " seconds at " + power + " W");
        spin(true);
        beep();
    }
    public void cook30()
    {
        cook(30, maxPower);
    }
    public void beep()
    {
        System.out.println("Beep!");
    }
    public void defrost(int time, int power)
    {

    }
    public String microwaveBrand()
    {
        System.out.println("Enter the brand of your microwave: ");
        Scanner scan = new Scanner(System.in);
        String brand = scan.next();
        scan.close();
        return brand;
    }

    public static void main(String[] args)
    {
        Microwave superCoolMicrowave = new Microwave("Samsung", 800);
        //superCoolMicrowave.brand = superCoolMicrowave.microwaveBrand();
        System.out.println("Your microwave was made by " + superCoolMicrowave.brand);
        superCoolMicrowave.cook30();
        superCoolMicrowave.cook(3000, 700);
        superCoolMicrowave.cook();
    }
}