public class Main {
    public static void main(String[] args){
        String n = NameFormatter.format("Dr", "Mel", "B", "Johnson", "PhD");
        String n2 = NameFormatter.format("Mel", "Johnson");
        String n6 = NameFormatter.format("Andy", "Tang");
        String n3 = NameFormatter.format("", "Mel", "B", "Johnson", "PhD");
        String n4 = NameFormatter.format("Andy J Chen PhD");
        String n5 = NameFormatter.format("Andy J Chen");
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
    }
}
