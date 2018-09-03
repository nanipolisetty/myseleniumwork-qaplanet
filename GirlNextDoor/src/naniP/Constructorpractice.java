package naniP;

public class Constructorpractice {
int roll;
Constructorpractice() {
	roll=10;
}
void printinstancevariable(){
System.out.println(roll);	
}

public static void main(String[] args) {

	Constructorpractice amen=new Constructorpractice();
	amen.printinstancevariable();
}
}
