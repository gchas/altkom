package pl.altkom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class TokenizerSample {
	public static void main(String[] args) {
		String aString = "aa,bb,cc";
		StringTokenizer parser = new StringTokenizer(aString);
		List<String> list = new ArrayList<String>();

		while (parser.hasMoreTokens()) {
			String token = parser.nextToken(",");
			list.add(token);
		}
		// System.out.println(list);
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println(val.toString());
		}
	}
}