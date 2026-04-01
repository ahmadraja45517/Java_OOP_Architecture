package ahmad;

// 1. Import your classes so Main knows where to find them

public class Main {
    public static void main(String[] args) {

//        System.out.println("--- TESTING STUDENTS ---");
//
//        Student ahmad = new Student("Ahmad Raja", 2330679, 8.13, "Backend Developer");
//        Student harshit = new Student("Harshit Khanna", 2330680, 9.75, "Frontend Developer");
//
//        ahmad.displayResume();
//        harshit.displayResume();


        System.out.println("\n--- TESTING COMPANIES ---");

         Company google = new Company("Google Inc.", "googlehr@gmail.com", "Technology");
         Company amazon = new Company("Amazon", "amazonhr@gmail.com", "E-commerce & Cloud");
         Company startup = new Company("Local Startup", "startup@gmail.com", "AI & Data Science");

         google.display();
         amazon.display();
         startup.display();
    }
}