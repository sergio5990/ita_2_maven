package by.itacademy.user;

public abstract class NameUtil {

    private NameUtil() {
    }

    public static String formatName(String firstName, String lastName){
        return String.format("%s %s", firstName, lastName);
    }

}
