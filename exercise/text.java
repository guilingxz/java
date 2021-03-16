package exercise;

import java.util.Scanner;

public class text {

//	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		// TODO 自动生成的方法存根
        int a[]=new int[10];
        int x,y;
		Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        System.out.println("x="+x);
        int sum = 0;
        for(int i=0;i<100;i++)
        {
        	if(i%2==0)
        	{
        		sum = sum + i;
        	}
        }
        System.out.println("sum=" + sum);
     }
}
