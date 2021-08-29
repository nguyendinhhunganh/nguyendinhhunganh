package bai_18_string_regex.bai_tap.validate_so_dien_thoai;

public class TelephoneExampleTest {
    public static final String[] telephones = new String[] { "(84)-(0978583967)", "(80)-(0986456693)", "(a4)-(1964299648)",  "(84)-(1974389648)", "(a8)-(7492765994)"};

    public static void main(String[] args) {
        TelephoneExample telephoneExample = new TelephoneExample();
        for (String telephone : telephones) {
            boolean isValid = telephoneExample.validate(telephone);
            System.out.println("telephone is " + telephone +" is valid: "+ isValid);
        }
    }
}
