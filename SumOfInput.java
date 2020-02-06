/**
 * Write a description of class SumOfInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sum;


    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables

    }

    public Integer oneToNumber(Integer numberToSum){
       sum = 0;
            for (int x =1; x<=numberToSum; x++){
              sum += x;
            }

        return sum;
    }

}
