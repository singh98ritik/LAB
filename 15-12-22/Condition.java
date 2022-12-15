package basic;

import java.util.Scanner;

public class Condition {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("enter a character");
		ch=sc.next().charAt(0);
		System.out.println(ch>='a'&&ch<='z'? "alphabet":ch>='A'&& ch<='Z'?"alphabet":ch>='0' && ch<='9'?"Digit":"Special character");
	}

}
