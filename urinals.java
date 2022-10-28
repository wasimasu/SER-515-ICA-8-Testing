// Author : Wasim Ahamed Syed
import java.io.File;
import java.util.Scanner;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class urinals{
    static int countUrinals(String str)
    {   int cnt=0;
        int l = str.length();

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