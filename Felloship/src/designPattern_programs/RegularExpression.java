package designPattern_programs;

import java.util.regex.Pattern;
/**
 * @author Sushant Patwari
 * @since 21/02/2019
 * @aim To implement program for regular expression
 */
public class RegularExpression {
	public static void main(String a[]) {
		System.out.println(Pattern.matches(".s", "as"));// true (2nd char is s)
		System.out.println(Pattern.matches(".s", "mk"));// false (2nd char is not s)
		System.out.println(Pattern.matches(".s", "mst"));// false (has more than 2 char)
		System.out.println(Pattern.matches(".s", "amms"));// false (has more than 2 char)
		System.out.println(Pattern.matches("..s", "mas"));// true (3rd char is s)
		System.out.println();
		
		// [abc] --> a, b, or c (simple class)
		// [^abc] --> Any character except a, b, or c (negation)
		// [a-zA-Z] --> a through z or A through Z, inclusive (range)
		// [a-d[m-p]]--> a through d, or m through p: [a-dm-p] (union)
		// [a-z&&[def]] --> d, e, or f (intersection)
		System.out.println(Pattern.matches("[amn]", "abcd"));// false (not a or m or n)
		System.out.println(Pattern.matches("[amn]", "a"));// true (among a or m or n)
		System.out.println(Pattern.matches("[amn]", "ammmna"));// false (m and a comes more than once)
		System.out.println();
		
		// X? X occurs once or not at all
		// X+ X occurs once or more times
		// X* X occurs zero or more times
		// X{n} X occurs n times only
		// X{n,} X occurs n or more times
		// X{y,z} X occurs at least y times but less than z times
		System.out.println(Pattern.matches("[amn]?", "a"));// true (a or m or n comes one time)
		System.out.println(Pattern.matches("[amn]?", "aaa"));// false (a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));// false (a m and n comes more than one time)
		System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
		System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
		System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)
		System.out.println();
		
		//d means digit, D means nin-digit, s means white space, S means non white space, w means word character, W non word character
		System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
		System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
		System.out.println(Pattern.matches("\\d*", "32"));//true (digit and may come 0 or more times)
		System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)
		System.out.println();
		
		//regular expression that accepts alphanumeric characters only. 
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)
		System.out.println();
		
		//regular expression that accepts 10 digit numeric characters starting with 7, 8 or 9 only
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//trueSystem.out.println("by metacharacters ...");
		System.out.println(Pattern.matches("[789]\\d{9}", "8853038949"));//true
		System.out.println(Pattern.matches("[789]\\d{9}", "3853038949"));//false (starts from 3)
	}
	
}