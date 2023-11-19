import java.util.Comparator;

public class CompareByName implements Comparator<Student>{
	public int compare(Student studentA, Student studentB) {
		return studentA.getName().compareTo(studentB.getName());
	}
}
