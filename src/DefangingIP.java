import java.util.Arrays;

public class DefangingIP {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("255.100.50.0"));
    }

    public static String defangIPaddr(String address) {
        String[] split = address.split("[.]");
        String resultString = "";
        for (int i = 0; i < split.length; i++) {
            resultString+=split[i];
            if (!(i*2 == split.length * 2 - 2)) {
                resultString+="[.]";
            }
        }
        return resultString;
    }

}
