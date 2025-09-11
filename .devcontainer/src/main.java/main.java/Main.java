public class Main
{
    public static void main(String[] args)
    {
        Microwave bob = new Microwave("BFA", 1000);
        bob.cook30();
        /*LanguageHelper.greet();
        if (LanguageHelper.happy()) {
            System.out.println("happy");
        }else {
            System.out.println("sad");
        }
        System.out.println(LanguageHelper.salutation());*/
        Microwave fred = new Microwave("BFA", 1000);
        System.out.print("bob: " + bob);
        System.out.println(", fred: " +fred);
    }
}