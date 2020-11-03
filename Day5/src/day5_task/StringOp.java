package day5_task;
import java.util.Scanner;
public class StringOp {
	String str ="ashoka";
	char[]s=str.toCharArray();
	private void  Add(){
		System.out.println(s);
		
	}
	private void Replace(){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length;i++){
			if(s[i]%2!=0){
				System.out.print(s[i]+"#");
			}
		}
	}
   private void Remove(){
	   int temp;
	   for(int i=0;i<(s.length)-1;i++){
		   for(int j=i+1;j<s.length;j++){
			   if(s[i]==s[j]){
				   s[j]=' ';
			   }
		   }
	   }
	   System.out.println(s);
   }
 private void Upper(){
	 for(int i=0;i<s.length;i++){
		 if((s[i]%2!=0)&&(s[i]>=97)&&(s[i]<=122)){
			 s[i]=(char)(s[i]-32);
		 }
	 }
	 System.out.println(s);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOp s=new StringOp();
		int a;
		char op;
		Scanner scan=new Scanner(System.in);
		do{
			System.out.println("1.add 2.# 3.Remove 4.Upper");
			int ch=scan.nextInt();
			switch(ch){
			case 1:
				s.Add();
				break;
			case 2:
				s.Replace();
				System.out.println();
				break;
			case 3:
				s.Remove();
				break;
				case 4:
					s.Upper();
				break;
			}
			System.out.println("continue or not");
			op=scan.next().charAt(0);
		}
		while(op=='y');
			
			}
		

	}


