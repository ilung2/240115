import dongsu.DongsuUtil;
import ilung.IlungUtil;
import ilung.IlungUtil;

public class Main {
	public static void main(String[] args) {
		DongsuUtil u = new DongsuUtil();
		int result = u.plus(100, 200);
		System.out.println(result);
		
		IlungUtil i = new IlungUtil();
		System.out.println(i.plus(300, 400));
		System.out.println(i.divide(300, 400));
	}
}
