package regression.Clients;

import Util.DoLogin;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Menu;
import pages.clients.AddClient;

import java.io.FileInputStream;
import java.io.IOException;

import static utility.MyDatProvider.getMyData;

public class AddClientDataProviderTest extends DoLogin {


    @Test (dataProvider = "getData")
    public void addClientTest(String name,String surname,String language,String add1,
                              String add2,String city,String state,String zip,String country,
                              String gender,String birthdate,String phone,String mobile,
                              String fax,String email,String web,String vat,String tax)
    {
        // 3. click on add client link from menu
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);
        addClient.setClientName(name);
        addClient.setClientSurname(surname);
        addClient.setLanguage(language);
        addClient.setClientAdd1(add1);
        addClient.setClientAdd2(add2);
        addClient.setClientCity(city);
        addClient.setClientState(state);
        addClient.setClientZip(zip);
        addClient.setCountry( country);
        addClient.setGender(gender);
        addClient.setBirthdate(birthdate);
        addClient.setClientPhone(phone);
        addClient.setClientMobile(mobile);
        addClient.setClientFax(fax);
        addClient.setClientEmail(email);
        addClient.setClientWeb(web);
        addClient.setClientVat(vat);
        addClient.setClientTax(tax);
        addClient.clickSave();
    }

    @DataProvider
    public Object[][] getData() throws IOException {

        return getMyData("Data\\invoiceplane.xlsx","Sheet3");

    }
}
