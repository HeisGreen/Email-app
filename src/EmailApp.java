public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Chido", "Green");
        em1.showInfo();
        System.out.println(em1.showInfo());

        Email em2 = new Email("Grace", "Essien");
        em2.showInfo();
        System.out.println(em2.showInfo());
    }
}