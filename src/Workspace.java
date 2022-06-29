import java.util.Scanner;

public class Workspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		String str;
		int val[] = new int[100];
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String[] s=str.split("\\s+");
		
		for(int j=0;j<s.length;j++)
		{
			val[j]=Integer.parseInt(s[j]);	
		}
		
		
		
	}

}
