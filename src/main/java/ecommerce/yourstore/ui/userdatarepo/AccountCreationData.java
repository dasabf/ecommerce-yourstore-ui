package ecommerce.yourstore.ui.userdatarepo;

import java.util.List;
import java.util.Map;

public class AccountCreationData {
    private static String salutation;
    private static String firstName;
    private static String lastName;
    private static String email;
    private static String password;
    private static String day;
    private static String month;
    private static String year;
    private static boolean newsletter;
    private static boolean specialoffer;
    private static String firstName1;
    private static String lastName1;
    private static String company;
    private static String address;
    private static String city;
    private static String state;
    private static String pin;
    private static String country;
    private static String mobile;
    private static String alias;

    public void setValues(List<Map<String, String >> data){
        salutation = data.get(0).get("Salutation");
        firstName = data.get(0).get("firstName");
        lastName = data.get(0).get("lastName");
        email = data.get(0).get("email");
        password = data.get(0).get("password");
        day = data.get(0).get("Day");
        month = data.get(0).get("Month");
        year = data.get(0).get("Year");

        if(data.get(0).get("NewsLetter").equalsIgnoreCase("Y")){
            newsletter = true;
        }else{
            newsletter = false;
        }

        if(data.get(0).get("specialoffer").equalsIgnoreCase("Y")){
            specialoffer = true;
        }else{
            specialoffer = false;
        }

        firstName1 = data.get(0).get("firstName1");

    }
}
