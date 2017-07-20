
public class ConCheck {
	public static void main(String[] args) {
		Eculid eculid = new Eculid();
		long starttime=System.nanoTime();
		gcd(31415, 14142, min(31415, 14142));
		long waste = System.nanoTime()-starttime;
		System.out.println(waste/(eculid.getWaste()));
	}
	public static int gcd(int m,int n ,int index){
		
		while((m%index) !=0 || (n%index)!=0){
			 index --;
		}
			return index;
	}
	public static int min(int m,int n){
		if (m > n){
			return n;
		}else{
			return m;
		}
	}

}
