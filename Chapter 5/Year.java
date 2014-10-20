
public class Year
{
    private int year;
    public Year(int yearEntry)
    {
       this.year = yearEntry;
    }
    public boolean isLeapYear()
    {
        if(this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
