public class CodeupCrypt {
    public static double version;

    /* HASHING */
    /*
    Chars	Replace
    a or A	4
    e or E	3
    i or I	1
    o or O	0
    u or U	9
     */
    public static String hashPassword(String str) {
        return str
                .replace('a', '4')
                .replace('A', '4')
                .replace('e', '3')
                .replace('E', '3')
                .replace('i', '1')
                .replace('I', '1')
                .replace('o', '0')
                .replace('O', '0')
                .replace('u', '9')
                .replace('U', '9');
    }

    public static boolean checkPassword(String plain, String crypt) {
        return false;
    }
}
