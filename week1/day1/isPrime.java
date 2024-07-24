package week1.day1;

public class isPrime {
	   public static void main(String[] args) {
	      int num=71;
	      int count=0;
	      
	      if(num<=1)
	  	{
	  		count=1;
	  	}
	  	else
	  	{
	  	for (int i = 2; i <num; i++) 
	  	{
	  		if(num%i==0)
	  			count=1;
	  	}
	  	}
	  	if (count ==0)
	  	{
	  		System.out.println(num+" is a Prime Number");
	  	}
	  	else
	  	{
	  		System.out.println(num+" is not a Prime Number");
	  	}
	  }}
	

