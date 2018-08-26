package methods;
import java.io.*;
public class Command_line_arguments {
void add(int x, int y){
int z=x+y;
System.out.println("sum of"+x+"and"+y+"is"+z);
}
public static void main(String[] args) throws IOException{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter first value :");
int m=Integer.parseInt(br.readLine());
System.out.println("Enter Second value:");
int n=Integer.parseInt(br.readLine());
Command_line_arguments ad=new Command_line_arguments();
ad.add(m, n);



}

	
	
}
