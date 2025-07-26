import java.util.*;
public class beautifulNum {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		int b=0;
		int c=0;
		
		
		while(num!=0) {
			int a=num%10;
			if(a%2==0) {
				b=b+1;
			}
			else{
				c=c+1;
			}
			num=num/10;
		}
		if(b==c) {
			System.out.println("beautiful");
		}
		else{
			System.out.println("not a beautiful");
		}
	}
}
