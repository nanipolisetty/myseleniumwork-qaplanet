package naniP;
public class thisDemo {
int a= 10;
int b= 20;
int c=10;

void show(){
	int b= 30;
	int c= 40;
System.out.println(a);
System.out.println(b);
System.out.println(b);
System.out.println(this.c);
this.msg();
}
void msg(){
	
System.out.println("hai");	
	
}
public static void main(String[] args) {
	thisDemo kill=new thisDemo();
kill.show();
}
}


