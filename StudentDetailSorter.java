import java.util.ArrayList;
import java.util.Comparator;

public class StudentDetailSorter {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "Leo", "920 A Street - Hayward"));
		studentList.add(new Student(2, "Antonella", "110 Alboran sea - Sacramento"));
		studentList.add(new Student(5, "Ciro", "101 Foothill Blvd - Vacaville"));
		studentList.add(new Student(9, "Dibu", "1500 Rankin Street - Oakland"));
		studentList.add(new Student(4, "Thiago", "898 Main Street - Milpitas"));
		studentList.add(new Student(7, "Neymar", "799 2nd Street - Richmond"));
		studentList.add(new Student(10, "Enzo", "279 Rancho Cordova - Sacramento"));
		studentList.add(new Student(6, "Suarez", "999 Castro valley - West Sacramento"));
		studentList.add(new Student(3, "Mateo", "6466 Redwood road - Freemont"));
		studentList.add(new Student(8, "Angel", "213 Truxel Blvd - Citrus Heights"));
		
		//Display students list
		System.out.println("Student List :");
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		//Display students list sorted by name
		SortSelection(studentList, new CompareByName());
		System.out.println("\nStudents sorted by Name : ");
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		//Display students list sorted by Roll no
		SortSelection(studentList, new CompareByRollNo());
		System.out.println("\nStudents sorted by Roll no: ");
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
	}
	public static void SortSelection(ArrayList<Student> student, Comparator<Student> comparator) {
		for(int i=0; i<student.size()-1; i++) {
			int index = i;
			for(int j= i+1; j<student.size(); j++ ) {
				if(comparator.compare(student.get(j), student.get(index)) < 0) {
					index = j;
				}
			}
			Student data = student.get(index);
			student.set(index, student.get(i));
			student.set(i, data);
		}
	}
}
