
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class a_11656 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder(br.readLine());
		String s = new String(br.readLine());
		List<String> al = new ArrayList<String>();
		int len = s.length();
		for (int i=0;i<len;i++) al.add(new String(s.substring(i)));
		Collections.sort(al);
		for (int i=0;i<len;i++) System.out.println(al.get(i));
		//int len = sb.length();
		//for(int i=0; i<len; i++) al.add(new StringBuilder(sb.substring(i)));
		//Collections.sort(al,new Comparator<StringBuilder>);
	}
}
