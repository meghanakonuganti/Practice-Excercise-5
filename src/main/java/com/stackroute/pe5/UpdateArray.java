package main.java.com.stackroute.pe5;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class UpdateArray {
    /*program to update specific array element by given element and empty the array list.*/
    public List<String> updateElement(List<String> list,String value ,String updatevalue)
    {
        ListIterator<String> itr=list.listIterator();

        while(itr.hasNext())
        {
            String next=itr.next();
            if(next.equals(value))
            {
                itr.set(updatevalue);
            }

        }
        return list;

    }

}
