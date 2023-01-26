
public class testStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student si = new Student("Sirapob Srimai","1 Happy Ave");
		System.out.println(si);
		
		si.setAddress("39 Pattanakarn");
		System.out.println(si);
		System.out.println(si.getName());
		System.out.println(si.getAddress());
		
		si.addCourseGrade("INT107", 75);
		si.addCourseGrade("INT108", 70);
		si.addCourseGrade("MSC-202", 68);
		si.printGrades();
		
		System.out.printf("\nThe average grade is %.2f%n",si.getAverageGrade());

		
	}

}
