import java.io.*;
import java.util.*;
import java.lang.Math;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[] = new char [26];
		for(int i = 65, j = 0 ; i <= 90; i++, j++){
		ch [j] = (char)i;
		
		}
		for(int r = 0; r < 26; r++){
			if (r<24){
				System.out.print(ch[r] + ", ");
			}
			else if(r == 25 ){
				System.out.print(ch[r]);
			}
			
			
		}
	}

}
