//WAP to find the maximum occurring character in a String.
package assignment4;

public class maximumOccurringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="RITESHKUMARVERMA";
		
		System.out.println("Original String: " +s);
		
		int[]freq=new int[128];
		char[] chArr=s.toCharArray();
		
		for(int i=0;i<chArr.length;i++) {
			freq[(int)(chArr[i])]++;
		}
		System.out.println("Characters"+"	"+"Occuring");
		System.out.println("=================");
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
			System.out.println((char)(i)+"		"+freq[i]);
			}
		}
		int maxOccur=Integer.MIN_VALUE;
		char maxOccurChar='\u0000';
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>maxOccur) {
				maxOccur=freq[i];
				maxOccurChar=(char)(i);
			}
		}
		System.out.println("=================");
		System.out.println("maximum occuring character: "+maxOccurChar);
		System.out.println("Occuring " +maxOccur+" times");

	}

}
