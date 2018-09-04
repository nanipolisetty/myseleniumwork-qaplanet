package naniP;

public class Parameterisedconstructor {
int y;
	
	Parameterisedconstructor(int x){
		oldsport=x;
		
	}
public static void main(String[] args) {
	Parameterisedconstructor p=new Parameterisedconstructor(10);
	Parameterisedconstructor a=new Parameterisedconstructor(20);
	Parameterisedconstructor r=new Parameterisedconstructor(30);
	Parameterisedconstructor v=new Parameterisedconstructor(101);
	Parameterisedconstructor aa=new Parameterisedconstructor(120);
	Parameterisedconstructor t=new Parameterisedconstructor(102);
	Parameterisedconstructor h=new Parameterisedconstructor(105);
	Parameterisedconstructor y=new Parameterisedconstructor(106);
	p.method();
	a.method();
	r.method();
	v.method();
	t.method();
	h.method();
	y.method();
	
}
void method(){
System.out.println(oldsport);

}
}
