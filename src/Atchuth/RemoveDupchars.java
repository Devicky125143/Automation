package Atchuth;

public class RemoveDupchars {
  public static void main(String[] args) {
	 String s="atchutarao";
	 StringBuilder sb= new StringBuilder();
	 
	 char [] chars=s.toCharArray();
	 
	for(int i=0;i<s.length();i++) {
		
		char c=s.charAt(i);
		
		int idx=s.indexOf(c,i+1);
		if(idx==-1) {
			sb.append(c);
		}
	}
	System.out.println(sb);
}
}
