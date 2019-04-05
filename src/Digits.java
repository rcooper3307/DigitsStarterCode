import java.util.*;
import java.lang.*;

public class Digits
{
    //The list of digits from the number used to //construct this object
    ArrayList<Integer> digitList;

    //Constructs a Digits object that
    //represents num
    public Digits (int num)
    {
        List<Integer> digitList = getDigitList();
        //implemented in part (a)
        String numStr = ""+num;
        for(int i = 0; i < numStr.length(); i++)
        {
            int result = Integer.parseInt(numStr.substring(i,i+1));
            digitList.add(result);
        }
    }
    public boolean isStrictlyIncreasing()
    {
        //implemented in part (b)
        return true;
    }
    //Extra method to make the runner easier to read
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

}
