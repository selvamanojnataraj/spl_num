import java.util.*;
public class autobiographNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		int a=0;
		int cnt=0;
		int sum=0;
		
		while(num!=0) {
			a=num%10;
			sum=sum+a;
			cnt+=1;
			num=num/10; 
		}
		if(sum==cnt) {
			System.out.println("autobiographic num");
		}
		else {
			System.out.println("not a autobiographic num");
		}

}
}
