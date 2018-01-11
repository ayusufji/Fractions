package code;

public class Fraction
{
    private int num, denom;

    public Fraction (int num, int denom)
    {
        this.num = num;
        this.denom = denom;
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
}
