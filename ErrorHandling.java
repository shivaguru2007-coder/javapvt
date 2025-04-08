public class ErrorHandling {
    public static void main(String[] args) {
        try {
            String s=null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}