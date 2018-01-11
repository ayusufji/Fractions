package code;

public class Runner
{
    public static void main(String[] args)
    {
        Fraction myFraction = new Fraction (2,3);
        Fraction otherFraction = new Fraction (5);
        Fraction a = new Fraction(myFraction);
        Fraction multiplied = myFraction.multiply(otherFraction);
        System.out.print(multiplied);
    }

}
