import java.util.*;
public class superNum {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number");
    int num=sc.nextInt();
    int b=0,c=0;
    
    
    while(num!=0) {
    	int a=num%10;
    	if(a%2==0) {
    		b=b+a;
    	}
    	else {
    		c=c+a;
    	}
    	num=num/10;
    }
    if(b==c)
    	System.out.println("superNum");
    else
    	System.out.println("not a superNumber");
}
}
