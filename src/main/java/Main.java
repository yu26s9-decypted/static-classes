public class Main {
    public static void main(String[] args){
        String n = NameFormatter.format("Dr", "Mel", "B", "Johnson", "PhD");
        String n2 = NameFormatter.format("Mel", "Johnson");
        String n3 = NameFormatter.format("", "Mel", "B", "Johnson", "PhD");
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
    }
}
