
public class Eculid {
	public long getWaste() {
		long starttime=System.nanoTime();
		eculid(31415, 14142);
		return (System.nanoTime()-starttime);
	}
	public static int eculid(int m,int n){
		int r = 0;
		while( n != 0){
			r = m%n;
			m = n;
			n = r;
		}
		return m;
		
	}

}
