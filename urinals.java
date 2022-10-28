// Author : Wasim Ahamed Syed
import java.io.File;
import java.util.Scanner;
import java.io.*;

import static java.lang.Character.isDigit;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class urinals{
    static int countUrinals(String str)
    {   int cnt=0;
        int l = str.length();
        if(!goodString(str))
            return -1;
        int i = 0;
        while(i < l)
        {
            if(str.charAt(i)=='0')
            {
                if((i-1<0 || str.charAt(i-1)=='0') && (i+1>=l || str.charAt(i+1)=='0'))
                {
                    cnt++;
                    i++;
                }
            }
            i++;
        }
        return cnt;

    }
    static Boolean goodString(String str)
    {
        int l = str.length();
        for(int i=1; i<l; i++)
        {
            if(str.charAt(i)=='1' && str.charAt(i-1)=='1')
            {
                return false;
            }
            else if(str.charAt(i) > '1'){
                return false;
            }
            else if(!isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        urinals obj = new urinals();

        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter String : ");
        s = sc.next();
        int ans = obj.countUrinals(s);
        System.out.println(ans);
    }
}