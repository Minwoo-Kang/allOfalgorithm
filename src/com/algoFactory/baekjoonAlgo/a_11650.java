import java.io.*;
import java.util.*;
class point {
	int x;
	int y;

	point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class a_11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		point[] arr = new point[N];
		StringTokenizer st;
		for(int i=0; i<N;i++){
			st = new StringTokenizer(br.readLine()," ");
			arr[i] = new point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(arr, new Comparator<point>(){
			public int compare(point p1, point p2){
				if(p1.x==p2.x){
					return p1.y-p2.y;
				}else return p1.x-p2.x;
			}
		});
		for(int i=0;i<N;i++) System.out.println(arr[i].x +" "+ arr[i].y);
	}
}
