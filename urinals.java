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
    public String readFile(String filename)
    {
        //the path changes w.r.t where file is stored
        String f = "out/production/ICA 8 - Testing/" + filename;
        try {
            File file = new File(f);
            Scanner scr = new Scanner(file);
            //String str = this.getOutputFileName();
            if(file.length()==0){
                return "File is empty, please enter a valid file";
            }
            while (scr.hasNextLine()) {
                String line = scr.nextLine();
                int a = this.countUrinals(line);
               // this.writeToFile(a,str);
                System.out.println(a);
            }
            return "File found and processed properly";
        } catch (IOException e) {
            e.printStackTrace();
            return "File doesn't exist";
        }
    }

    public static void main(String[] args) {
        urinals obj = new urinals();
        System.out.println("Do you want to import inputs from a file or by console?");
        System.out.println("1. File");
        System.out.println("2. Console");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter name of the input file : ");
                String str = sc.next();
                System.out.println(obj.readFile(str));
                break;
            }
            case 2:
            {
                String s;
                char c='N';
                do {
                    System.out.println("Enter String : ");
                    s = sc.next();
                    int ans = obj.countUrinals(s);
                    System.out.println("Continue input (Y/N)?");
                    c = sc.next().charAt(0);
                }while(c=='Y');
            }

        }

    }
}