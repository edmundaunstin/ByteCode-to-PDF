import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import java.math.*;

class Combination { 
  
   
    static void combinationUtil(int arr[], int n, int r, int index, 
                                int data[], int i) 
    { 
    	int g[]=new int[3];
    	int m=0,max=0,min=99999;
        if (index == r) 
        { 
            for (int j=0; j<r; j++) {
                System.out.print(data[j]+" "); 
                g[m]=data[0]*data[1];
                m++;
                //System.out.println(g[m]);
                if(g[m]>max)
                	max=g[m];
                if(g[m]<min)
                	min=g[m];
            }
            System.out.println(""+max+" "+min);
            System.out.println(""); 
        return; 
        } 
        if (i >= n) 
        return; 
        data[index] = arr[i]; 
        combinationUtil(arr, n, r, index+1, data, i+1); 
        combinationUtil(arr, n, r, index, data, i+1); 
    } 
    
    static void printCombination(int arr[], int n, int r) 
    { 
        int data[]=new int[r]; 
        combinationUtil(arr, n, r, 0, data, 0); 
    } 
    public static void main (String[] args) { 
    	
    	
		String str;
		
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String[] s=str.trim().split("\\s+");
		//System.out.println(s.length);
		int arr[] = new int[s.length];
		for(int j=0;j<s.length;j++)
		{
			arr[j]=Integer.parseInt(s[j]);	
		}        
        int r = 2; 
        int n = arr.length; 
        printCombination(arr, n, r); 
    } 
} 