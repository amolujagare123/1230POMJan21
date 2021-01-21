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
        addClient.setClientName("Amit");
        addClient.setClientSurname("Patel");
        addClient.setClientAdd1("xyz");
        addClient.setClientAdd2("pqr");
        addClient.setClientCity("bhopal");
        addClient.setClientState("MP");
        addClient.clickSave();
    }
}
