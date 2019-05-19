package com.app;

public class Pattern {
	public static void main(String[] args) {
		//Pattern for Name:-
		String s1="Yog5esh@15";
		boolean b1=java.util.regex.Pattern.matches("[A-Z][a-z0-8]{3,9}[@!_][0-9]{2}",s1);
		System.out.println(b1);

		//Pattern for Password:-
		String s2="Password@24";
		boolean b2=java.util.regex.Pattern.matches("[A-Z][a-z0-9@!_]{3,10}[@!_][0-9]{2}",s2);
		System.out.println(b2);

		//Pattern for MobileNumber:-
		String s3="+919921275858";
		boolean b3=java.util.regex.Pattern.matches("[+]?[9]?[1]?[6-9][0-9]{9}",s3);
		System.out.println(b3);

		//Pattern for AdminID:-
		String s4="U6admin00";
		boolean b4=java.util.regex.Pattern.matches("[U]?[6]?[D]?[9]?[a-z]{4,6}[0]{2}",s4);
		System.out.println(b4);

		//Pattern for EmailID:-
		String s5="yog5esh@gmail.com";
		boolean b5=java.util.regex.Pattern.matches("[a-z0-9]{6,8}[@][a-z0-9]{3,5}[.][a-z]{3}",s5);
		System.out.println(b5);

		//Pattern for PANCard:-
		String s6="ASDFG5H2D65F1G2";
		boolean b6=java.util.regex.Pattern.matches("[A-Z0-9]{15}",s6);
		System.out.println(b6);

		//Pattern for AdharCard:-
		String s7="147852369456";
		boolean b7=java.util.regex.Pattern.matches("[0-9]{12}",s7);
		System.out.println(b7);

		//Pattern for AdharCard:-
		String s8="SID14785";
		boolean b8=java.util.regex.Pattern.matches("[S][I][D][0-9]{5}",s8);
		System.out.println(b8);
	}
}
