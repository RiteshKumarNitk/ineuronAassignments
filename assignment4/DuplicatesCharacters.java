//WAP to print Duplicates characters from the String.
package assignment4;
public class DuplicatesCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="RiteshKumarverma";
		str=str.toLowerCase();
		System.out.println("Original String: "+str);
		int[] freq=new int[26];
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			freq[ch-97]++;
		}
		for(int i=0;i<26;i++)
		{
			if(freq[i]>1)
			{
				char ch=(char) (i+97);
				temp=temp+ ch;
			}
		}
		System.out.println("Duplicate Characters:" +temp);
	}

}
