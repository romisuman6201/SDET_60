package pattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Star {

	@Test
	public void pater() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Test

	public void patter2() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Test
	public void pattern3() {
		/*
		*
		**
		***
		****
		*/
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Test
	public void pattern4() {
		/*
		 ****
		  ***
		   **
		    *
		    */
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Test

	public void recPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	@Test
	public void numberPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	@Test
	public void numPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	@Test
	public void numPattern2() {
		int num = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

	@Test
	public void tekon() {
		String s = "Tekon123";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				System.out.print(s.charAt(i));
			}
		}
	}

	@Test
	public void duplicate() {
		int[] a = { 20, 10, 30, 50, 10, 20, 40 };
        for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[i]=0;
				}
			}
		}
        for (int k = 0; k < a.length; k++) {
			if(a[k]!=0) {
				System.out.println(a[k]);
			}
		}
		
	}
}
