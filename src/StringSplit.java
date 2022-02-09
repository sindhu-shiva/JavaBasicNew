
public class StringSplit {
	
		public static void main(String[] args) {
		String s1 = "Hello welcome to java class";
		String[] x = s1.split(" "); // here we split by space
		System.out.println(s1.length());
		System.out.println(x.length);
		String[] x1 = s1.split("o"); // here we split by "o"
		for (String s:x1)
		{
		System.out.println(s);
		}
		System.out.println(s1.length());
		System.out.println(x1.length);
		}
		}

