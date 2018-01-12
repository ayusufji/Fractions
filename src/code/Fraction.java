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

        int min = Math.min(a,b);
        for (int i = min; i > 0 ; i--)
        {
            if (a%i == 0 && b%i == 0)
            {
                a /= i;
                b /= i;
                return i;
            }
        }

        return 1;
    }

    private void simplifiy()
    {
        int factor = gcf(num, denom);
        num /= factor;
        denom /= factor;
    }

}
