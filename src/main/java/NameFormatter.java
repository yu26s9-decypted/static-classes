public class NameFormatter {

    private NameFormatter(){}

    public static String format(String firstName, String lastName){
        return format("", firstName, "", lastName, "");
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        StringBuilder stringBuilder = new StringBuilder();

        if(!prefix.isBlank()) {
            stringBuilder.append(prefix).append(". ");
        }
        stringBuilder.append(firstName).append(" ");


        if(!middleName.isBlank()) {
            stringBuilder.append(middleName).append(" ");
        }

        if(!suffix.isBlank()){
            stringBuilder.append(lastName).append(", ");
            stringBuilder.append(suffix).append("");
        } else {
            stringBuilder.append(lastName).append("");
        }

        return stringBuilder.toString();
    }






}
