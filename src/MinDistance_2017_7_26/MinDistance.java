package MinDistance_2017_7_26;

public class MinDistance {
	public static void main(String[] args) {
		double a[] = {1,2,3,4,54,65,74,54.1,65.3,54.2};
		long starttime = System.nanoTime();
		System.out.println(decrease(a));
		long endtime = System.nanoTime();
		System.out.printf("TimeWaste:%s",endtime-starttime);
	}
	public static double decrease(double[] a) {
		int l = a.length;
		if (l == 0) {
			return -1;
		}else if (l==1) {
			return a[0];
		}
		double dmin = absolute(a[1], a[0]);
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (i != j && absolute(a[i], a[j]) < dmin ) {
					dmin = absolute(a[i], a[j]);
				}
			}
		}
		return dmin;
	}
	private static double absolute(double d, double e) {
		double rs = d-e;
		if (rs > 0) {
			return rs;
		}
		return -rs;
	}

}
