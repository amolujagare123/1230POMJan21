package regression.Clients;

import Util.DoLogin;
import Util.OpenUrl;
import org.testng.annotations.Test;
import pages.Menu;
import pages.clients.AddClient;

public class AddClientTest extends DoLogin {

    // 1. open url

    // 2. login


    @Test
    public void addClientTest()
    {
        // 3. click on add client link from menu
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setClientName("Amit2");
        addClient.setClientSurname("Patel");
        addClient.setLanguage("English");
        addClient.setClientAdd1("xyz");
        addClient.setClientAdd2("pqr");
        addClient.setClientCity("bhopal");
        addClient.setClientState("MP");
        addClient.setClientZip("8989");
        addClient.setCountry("Hungary");
        addClient.setGender("Female");
        addClient.setBirthdate("10/21/2021");
        addClient.setClientPhone("90909090");
        addClient.setClientMobile("90909090");
        addClient.setClientFax("90909090");
        addClient.setClientEmail("a@b.com");
        addClient.setClientWeb("www.xyz.com");
        addClient.setClientVat("90909090");
        addClient.setClientTax("90909090");
        addClient.clickSave();
    }
}
