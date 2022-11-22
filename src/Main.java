public class Main {
    public static void main(String[] args) {
        boolean accordance = Data.valid("admin!", "admin","admin");
        if(accordance) {
            System.out.println("Data valid!");
        } else {
            System.out.println("Data invalid!");
        }
    }

}