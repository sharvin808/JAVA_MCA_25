/*Create a class for CString having a string data member and provide functions for read, display, compare(return Boolean value),add and concatenate. */

import java.util.*;
import java.io.*;

class CString
{
    String sr;
    public void read()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        sr = s.nextLine();
    }
    public void disp()
    {
        System.out.println("String:"+ sr);
    }
    public boolean compare(CString c)
    {
        return this.sr.equals(c.sr);
    }
    public CString add(CString c)
    {
        CString temp = new CString();
        temp.sr = this.sr + c.sr;
        return temp;
    }
    public CString concat(CString c)
    {
        CString temp = new CString();
        temp.sr =this.sr.concat(c.sr);
        return temp;
    }
}

public class Program_13 
{
    public static void main(String args[])
    {
        CString s1 = new CString();
        CString s2 = new CString();
        CString added,concat;
        s1.read();
        s2.read();
        System.out.println("---String Entered---");
        s1.disp();
        s2.disp();
        System.out.println("--Are the two strings are same--"+s1.compare(s2));
        added = s1.add(s2);
        System.out.println("--After Addition--");
        added.disp();
        concat = s1.concat(s2);
        System.out.println("--After concatinated--");
        concat.disp();
        
    }    
}
