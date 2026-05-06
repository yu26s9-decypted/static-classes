import java.util.Set;

public class NameFormatter {

    private NameFormatter(){}

    public static String format(String firstName, String lastName){
        return format("", firstName, "", lastName, "");
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(lastName).append(", ");

        if(!prefix.isBlank() && prefix != null) {
            if(!prefix.endsWith(".")){
                stringBuilder.append(prefix).append(". ");
            } else {
                stringBuilder.append(prefix).append(" ");
            }


        }
        stringBuilder.append(firstName);


        if(!middleName.isBlank()) {
            stringBuilder.append(" ").append(middleName);
        }

        if(!suffix.isBlank() && suffix != null){
            if(!suffix.startsWith(",")){
                stringBuilder.append(", ").append(suffix);
            } else {
                stringBuilder.append(suffix);
            }

        }

        return stringBuilder.toString();
    }

    public static String format(String fullName){
        String prefix = "";
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String suffix = "";
        Set<String> prefixes = Set.of("Mr", "Mrs", "Miss", "Dr");
        Set<String> suffixs = Set.of("PhD, Jr, I, II, III");


        String[] split = fullName.split(",");
        if(split.length > 1){
            suffix = split[1].trim();
        }

        String name = split[0];
        String[] nameSplit = name.split(" ");

        if(nameSplit.length == 2){
            firstName = nameSplit[0];
            lastName = nameSplit[1];
        } else if (nameSplit.length == 3) {
            prefix = nameSplit[0];
            firstName = nameSplit[1];
            lastName = nameSplit[2];
        } else if(nameSplit.length == 4){
            if(prefixes.contains(nameSplit[0])) {
                prefix = nameSplit[0];
                firstName = nameSplit[1];
                middleName = nameSplit[2];
                lastName = nameSplit[3];
            } else {
                firstName = nameSplit[0];
                middleName = nameSplit[1];
                lastName = nameSplit[2];
                suffix = nameSplit[3];
            }
        }

        return format(prefix, firstName, middleName, lastName, suffix);
    }






}
