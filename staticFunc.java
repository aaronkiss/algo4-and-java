public class staticFunc {

	//求绝对值
	public static int abs(int x) {
		if (x < 0) return - x;
		else return x;
	}

	//判断是否为素数
	public static boolean isPrime(int N) {
		if (N < 2) return false;
		for (int i = 2; i * i <= N; i++)
			if (N % i == 0) return false;
		return true;
	}

	//求平方根
	public static double sqrt(double c) {
		if (c < 0) return Double.NaN;
		double err = 1e-15;
		double t = c;
		while (Math.abs(t - c / t) > err * t)
			t = (c / t + t) / 2.0;
		return t;
	}

	//求直角三角形斜边长度
	public static double hypotenuse(double a, double b) {
		return Math.sqrt(a * a + b * b);
	}

	//计算调和级数
	public static double H(int N) {
		double sum = 0.0;
		for (int i = 1; i <= N; i++)
			sum += 1.0 / i;
		return sum;
	}


	public static void main(String[] args) {
		System.out.println(abs(- 8));//求绝对值
		System.out.println(isPrime(5));//判断是否为素数
		System.out.println(sqrt(3));//求平方根
		System.out.println(hypotenuse(3, 4));//求直角三角形斜边长度
		System.out.println(H(2));//求调和级数
	}
}