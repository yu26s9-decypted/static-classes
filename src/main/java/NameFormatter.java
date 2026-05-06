public class NameFormatter {

    private NameFormatter(){}

    public static String format(String firstName, String lastName){
        return format(firstName, lastName);
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        StringBuilder stringBuilder = new StringBuilder();

        if(!prefix.isBlank() || !prefix.isEmpty()) {
            stringBuilder.append(prefix).append(" ");
        }
        stringBuilder.append(firstName);


        if(!middleName.isBlank() || !middleName.isEmpty()) {
            stringBuilder.append(middleName).append(" ");
        }

        stringBuilder.append(lastName);

        if(!suffix.isBlank() || !suffix.isEmpty()){
            stringBuilder.append(suffix).append("");
        }

        return stringBuilder.toString();
    }
}
