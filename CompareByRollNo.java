import java.util.Comparator;

public class CompareByRollNo implements Comparator<Student>{
	public int compare(Student studentA, Student studentB) {
		return Integer.compare(studentA.getRollno(), studentB.getRollno());
	}
}
