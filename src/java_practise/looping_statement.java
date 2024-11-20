package java_practise;

public class looping_statement {

	public static void multi(String name, int a) {
		while (a >= 0) {
			System.out.println(name);
			a = a - 1;
		}

	}

	public static void number(int a, int n) {
		while (a <= n) {
			System.out.println(a);

			a = a + 1;
		}
	}

	public static int reverse(int num) {
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		return rev;
	}

	public static void doing(int a) {
		do {
			System.out.println("Vin");
			a = a - 1;
		} while (a >= 0);
	}

	public static void main(String[] args) {
		multi("vinay", 5);
		number(1, 10);
		System.out.println(reverse(23));
		doing(5);
	}

}
