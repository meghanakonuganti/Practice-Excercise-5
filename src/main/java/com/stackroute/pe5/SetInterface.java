package main.java.com.stackroute.pe5;

/*

   a program to implement set interface which sorts the given randomly ordered names
    in ascending order. Convert the sorted set in to an  array list

 */

import java.util.Set;
import java.util.TreeSet;

public class SetInterface {


    public Set<String> setInterface(String str)
    {
        String[] arr=str.split(" ");
        Set<String> st=new TreeSet<String>();

        for(String s:arr)
        {
            st.add(s);
        }

        return st;
    }


}
