//WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
package assignment4;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ritesh Kumar Verma";
		System.out.println("Available String : "+str);
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		
			if(temp.indexOf(ch)<0)
			{
				temp+=ch;
			}
		}
		
		str=temp;
		System.out.println("After Deleting Duplicates: "+str);
	}

}
