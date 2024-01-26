import org.javatuples.Pair;
import org.javatuples.Quintet;

public class Main {
	public static void main(String[] args) {
		// 튜플, 트리플...
		Pair<String, Integer> pair = Pair.with("hello", Integer.valueOf(23));

		System.out.println(pair.getValue0());
		System.out.println(pair.getValue1());

		Quintet<String, Integer, Double, String, String> quintet
			= Quintet.with("a", Integer.valueOf(3),
				Double.valueOf(34.2), "b", "c");
		
	}
}
