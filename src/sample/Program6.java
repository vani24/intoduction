package sample;

public class Program6 {

	public static void main(String[] args) {
		 
		String str="Hello World";
		String revstring="";
		 
		for(int i=str.length()-1;i>=0;--i){
		revstring +=str.charAt(i);
		}
		 
		System.out.println(revstring);
		}

}
