package pages;

import java.util.*;  
public class Random_Gen
{
    int min;                     //minimum number that can be generated.
    int max;                    //maximum number that can be generated. 
    int value;
 
    public Random_Gen(int n, int m)
    {
        max = m;        //code goes in this class
        min = n;
        
    }
     
 
    public int getRandom()
    {
      
       
    	Random ran=new Random();
    	
         
     }

public static void main(String[] args)
    {
        int min = 1;                 // smallest number that can be generated
        int max = 20;                // largest number that can be generated
        Random_Gen  rg = new Random_Gen(min, max);
        int num;
        int[] frequency = new int[max];
         
         
        for (int x = 0; x < 10000; x++) 
        {
           num = rg.getRandom();
            
           System.out.println(num);
            
           for (int index = 0; index < max; index ++)     //determines frequency
              {
               if (num == index + 1) 
                 frequency[index]++;
               }
         }
          
          
          for (int index = 0; index < max; index ++)     // displays frequency
        {
            System.out.println(""+(index+1) + " = " + frequency[index]);
        }
   }
}