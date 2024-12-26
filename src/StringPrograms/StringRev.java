package StringPrograms;

public class StringRev {
   public static void main(String[] args) {
	 String s="atchutarao";
	 String rev="";
	 for(int i=s.length()-1;i>=0;i--) {
		 rev=rev+s.charAt(i);
	 }
	 System.out.println(rev);
	 System.out.println("===Passed===");
}
}
