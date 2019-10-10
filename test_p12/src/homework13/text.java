package homework13;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class text {
	public static void main(String[]args)throws IOException{
		System.out.println("請輸入整數");
		
		//@SuppressWarnings("unused")
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		//@SuppressWarnings("unused")
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1) {
			System.out.println("輸入的是1");
		}
		if(num == 2) {
			System.out.println("輸入的是2");
		}
		else {
			System.out.println("請輸入1或2");
		}
	}

}
