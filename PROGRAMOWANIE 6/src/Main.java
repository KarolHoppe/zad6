import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Student s=new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(1980, 1, 1));
        the indexNumber automatically assigned
        StudyProgramme it=new StudyProgramme("IT", "AAA", 7, 5); //7 is
        the number of semesters, 5 - number of possible ITN's before
        being allowed to be promoted to next semester
        s.enrollStudent(it); //we assign the student to the first
        semester by default
        s.addGrade(5, "PGO");
        s.addGrade(2, "APBD");
        all our students and run the promoteToNextSemester() method on
        each student.
        last semester - then we can set student's status = "Graduate".
        number of ITN's allowed on specific studies.
        Students.promoteAllStudents();
        Students.displayInfoAboutAllStudents();
    }
}
