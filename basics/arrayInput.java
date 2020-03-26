package basics;

import java.util.Scanner;

public class arrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,m,index=0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of array");
		n = s.nextInt();
		System.out.println(n);
		m = s.nextInt();
		System.out.println(m);
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		s.close();
		for(int i=n-1;i>=0;i--) {
			//System.out.println(arr[i]);
			if(arr[i]==m) {
				//System.out.println(i+1);
			    index=i;
				break;
			}
			}
		if (index==0) {
			System.out.println(-1);
	
	}else {
		System.out.println(index+1);
	}
	}
}
