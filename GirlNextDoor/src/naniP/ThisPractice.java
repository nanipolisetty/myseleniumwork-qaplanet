package naniP;

public class ThisPractice {
int a=10;
int b=20;
	
	ThisPractice(){
	int a=15;
	int c=11;
	System.out.println(a);
}

	void display(){                                        
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
	ThisPractice p=new ThisPractice();
	p.display();
}

}
