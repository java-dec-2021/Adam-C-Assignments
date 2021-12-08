public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("Project 2");
        Project project3 = new Project("Project 3","this is the third project");

        project1.setName("Project 1");
        project1.setDecsription("this is the first project");
        
        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
    }
}