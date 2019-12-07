 class Test1
 {
	 int a;
	 public
	 void set(int a)
	 {
		 this.a=a;
	 }
	 void modify(int a)
	 {
		 this.a=a;
	 }
	 void display()
	 {
		 System.out.println("a="+a);
	 } 
 }
	 class Test2
	 {
		 int b;
		 public
		 void set(int b)
		 {
			 this.b=b;
		 }
		 void modify(int b)
		 {
			 this.b=b;
		 }
		 void display()
		 {
			 System.out.println("b="+b);
		 }
	 }
 class Test3
 {
	 int c;
	 public
	 void set(int c)
	 {
		 this.c=c;
	 }
	 void modify(int c)
	 {
		 this.c=c;
	 }
	 void display()
	 {
		 System.out.println("c="+c);
	 }
 } 
 class Test4
 {
	 int d;
	 public
	 void set(int d)
	 {
		 this.d=d;
	 }
	 void modify(int d)
	 {
		 this.d=d;
	 }
	 void display()
	 {
		 System.out.println("d="+d);
	 }
 }
 class Test5
 {
	 int e;
	 public
	 void set(int e)
	 {
		 this.e=e;
	 }
	 void modify(int e)
	 {
		 this.e=e;
	 }
	 void display()
	 {
		 System.out.println("e="+e);
	 }
 } 
public class Assign1
{

	public static void main(String[] args)
	{
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		Test3 t3=new Test3();
		Test4 t4=new Test4();
		Test5 t5=new Test5();
		t1.set(03);
		t1.modify(15);
		t1.display();
		t2.set(3);
		t2.modify(24);
		t2.display();
		t3.set(23);
		t3.modify(32);
		t3.display();
		t4.set(45);
		t4.modify(25);
		t4.display();
		t5.set(21);
		t5.modify(32);
		t5.display();
	}
}

