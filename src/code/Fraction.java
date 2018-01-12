package code;

public class Fraction
{
    private int num, denom;

    public Fraction (int num, int denom)
    {
        if (denom == 0)
        {
            throw new IllegalArgumentException("Fractions cannot have a 0 denominator.");
        }
        else
        {
            this.num = num;
            this.denom = denom;
            simplifiy();
        }
    }

    public Fraction(int num)
    {
        this(num,1);
    }
    public Fraction(Fraction other)
    {
        num = other.num;
        denom = other.num;
    }


    @Override
    public String toString()
    {
        return num + " / " + denom;
    }


    public Fraction multiply(Fraction f)
    {

        return new Fraction(num*f.num, denom*f.denom);

    }

    public Fraction inverse()
    {
        if ( num == 0)
        {
            return null;
        }
       return new Fraction( denom, num );
    }

    public Fraction divide (Fraction f)
    {
        return new Fraction ( num*f.denom, denom* f.num);
    }

    public static int gcf(int a, int b)
    {
        int gcf = 1;


        return gcf;
    }

    private void simplifiy()
    {
        int min = Math.min(num, denom);
        for (int i = min; i > 0 ; i--)
        {
            if (num%i == 0 && denom%i == 0)
            {
                num /= i;
                denom /= i;
                return;
            }
        }
    }

}
