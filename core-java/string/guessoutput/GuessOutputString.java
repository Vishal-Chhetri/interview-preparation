package guessoutput;

public class GuessOutputString {

	public static void main(String args[]) {
		question1();
		question2();
		question3();
		question4();
		question5();
		// For explanation check below
	}

	public static void question1() {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}

	public static void question2() {
		String s1 = "abc";
		s1.concat("def");
		System.out.println(s1);
	}

	public static void question3() {
		String s = "Java";
		s = s.toLowerCase().replace('a', 'o');
		String result = s.substring(1, 3);
		System.out.println(result);
	}

	public static void question4() {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s1 + s2;
		String s4 = "abcdef";

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

	public static void question5() {
		String s1 = "abc";
		String s2 = s1;
		s1 = s1 + "def";

		System.out.println(s1);
		System.out.println(s2);
	}

//		Answer 1:
//		s1 == s2 will print true because both s1 and s2 refer to the same string literal in the string pool.
//		s1 == s3 will print false because s3 is a new String object created on the heap.
//		s1.equals(s3) will print true because equals method compares the content of the strings.
//		
//		Answer 2:
//		The output will be abc. The concat method does not change the original string; it returns a new string.

//		Answer 3:
//		The output will be ov. The toLowerCase method changes "Java" to "java". Then replace('a', 'o') changes it to "jovo". The substring(1, 3) returns characters from index 1 to 2, which are "ov".

//		Answer 4:
//		s3 == s4 will print false because s3 is created using concatenation at runtime, resulting in a new String object.
//		s3.equals(s4) will print true because the content of s3 and s4 is the same.

//		Answer 5:
//		s1 will print abcdef because s1 is concatenated with "def".
//		s2 will print abc because s2 still refers to the original s1 string before concatenation.

}