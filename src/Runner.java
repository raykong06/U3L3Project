public class Runner {
    public static void main(String[] args) {
        WhatsTheError score = new WhatsTheError(6);
        String grade = score.grade();
        System.out.println(grade);
    }
}
