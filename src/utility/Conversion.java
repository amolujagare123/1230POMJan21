package utility;

import javax.xml.crypto.dsig.SignatureMethod;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {


    public static String convertCountry(String shortCounty) {
        String fullFormCountry = "";

        switch (shortCounty) {
            case "IN":
                fullFormCountry = "India";
                break;
            case "AS":
                fullFormCountry = "American Samoa";
                break;
            case "AD":
                fullFormCountry = "Andorra";
                break;
            case "BD":
                fullFormCountry = "Bangladesh";
                break;
            case "CA":
                fullFormCountry = "Canada";
                break;
        }

        return fullFormCountry;
    }

    public static String getFullGender(String genderID) {
        String fullGender = "";

        switch (genderID) {
            case "0":
                fullGender = "Male";
                break;
            case "1":
                fullGender = "Female";
                break;
            case "2":
                fullGender = "Other";
                break;
        }

        return fullGender;
    }

    public static String getConvertedDate(String dateDb) throws ParseException // yyyy-dd-MM
    {
        String convertedDate ="";

        Date date = new SimpleDateFormat("yyyy-dd-MM").parse(dateDb);

        convertedDate = new SimpleDateFormat("dd/MM/yyyy").format(date);

        return convertedDate;

    }

}