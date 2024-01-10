class person{
	String name;
	int	age;
	long mo_no;
}
class student{
	String name;
	int roll_no;
	long mo_no;
}
class student1{
	String name;
	int roll_no;
	long mo_no;
}
class Main{
	public static void main(String[]args){
		person p1 = new person();
		student s1 = new student();
		student1 s2 = new student1();
		p1.name = "sneh";
		p1.age = 18;
		p1.mo_no = 9245671224L;
		s1.name = "mortal";
		s1.roll_no = 18;
		s1.mo_no = 9245672524L;
		s2.name = "scout";
		s2.roll_no = 18;
		s2.mo_no = 9245665224L;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.mo_no);
		System.out.println(s1.name);
		System.out.println(s1.roll_no);
		System.out.println(s1.mo_no);
		System.out.println(s2.name);
		System.out.println(s2.roll_no);
		System.out.println(s2.mo_no);
	}
}