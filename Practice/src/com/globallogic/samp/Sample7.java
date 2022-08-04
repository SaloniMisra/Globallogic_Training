package com.globallogic.samp;
import java.util.*;
public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0; int p=0;
		int min=0;
		int max=Integer.MAX_VALUE;
		String str="This is an umbrella";
		
        String[] st=str.split(" ");
        for(int i=0;i<st.length;i++)
        { if(st[i].length()>min)
        {
        	k=i;
        }
       	
        }
        System.out.println("the largest word is: "+ st[k]);
        for(int i=1;i<st.length;i++)
        { 
        	if(st[i].length()<st[i-1].length())
        { //System.out.println(st[i].length());
        	p=i;
        	
        }
       	
	}
        System.out.println("the smallest word is: "+ st[p]);

}
}
