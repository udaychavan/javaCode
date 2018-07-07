class Student {
	int id;
	String name;

	public Student(){

	}

	public Student(int x, String name){
		this.id = x;
		this.name = name;
	}
	
	public static void main(String args[]){
		Student s1 = new Student(12, "hello");
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}