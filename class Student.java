class Student
{
	int rno;
	String name;
	void getdata()
	{
	rno=1;
	name="john";
	}
	void display()
	{
	System.out.println("Rollno:"+rno+"\nName:"+name);
	}
}
class classdemo1
{
	public static void main(String[]args)
	{
	Student S=new Student();
	S.getdata();
	S.display(); 
	}
}