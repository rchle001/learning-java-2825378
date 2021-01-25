public class StudentProfile{

    String firstName;
    String lastName;
    int expectGradYear;
    double GPA;
    String DeclaredMajor;

    public StudentProfile(String firstName, String lastName, int expectGradYear, double GPA, String DeclaredMajor)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectGradYear = expectGradYear;
        this.GPA = GPA;
        this.DeclaredMajor = DeclaredMajor;
    }
    public void IncrementExpectedGradYear()
    {
        this.expectGradYear = this.expectGradYear + 1;
    }

}