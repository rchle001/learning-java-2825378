public class Main {

    public static void main(String[] args) {
        StudentProfile TonyProfile = new StudentProfile("Tony", "Moraciello", 2034, 3.2, "Computer Engineering");

        System.out.println(TonyProfile.expectGradYear);
        TonyProfile.IncrementExpectedGradYear();
        System.out.println(TonyProfile.expectGradYear);
    }

}
