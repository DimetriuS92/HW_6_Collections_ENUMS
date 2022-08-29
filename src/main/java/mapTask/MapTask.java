package mapTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MapTask {
    public static final Logger LOGGER = LogManager.getLogger(MapTask.class);
    public static void main(String[] args) {
        Person alfred = new Person(40, "Alfred");
        Person john = new Person(26, "John");
        Person alla = new Person(15, "Alla");
        alfred.accountsList.add(new Account("Twitter", "TwitterId"));
        alfred.accountsList.add(new Account("Google", "GoogleId"));
        alfred.accountsList.add(new Account("Facebook", "FacebookId"));
        john.accountsList.add(new Account("Telegram", "TelegramId"));
        john.accountsList.add(new Account("Ukrnet", "UkrnetId"));
        john.accountsList.add(new Account("Facebook", "FacebookId"));
        alla.accountsList.add(new Account("Monobank", "MonobankId"));
        alla.accountsList.add(new Account("Google", "GoogleId"));
        alla.accountsList.add(new Account("Privatbank", "PrivatbankId"));
        Map<Person, ArrayList<Account>> personAccountsMap = new HashMap<>();
        personAccountsMap.put(john, john.accountsList);
        personAccountsMap.put(alla, alla.accountsList);
        personAccountsMap.put(alfred, alfred.accountsList);
        AccountControl accountControl = new AccountControl();
        accountControl.addAccountToTheList(personAccountsMap, john, new Account("Linkedin", "LinkedinID"));
        LOGGER.info("\nAdded account 'LinkedIn' for John: " + personAccountsMap);

        // Delete an account for a specific person
        accountControl.deleteAccountForPerson(personAccountsMap, alla, "google");
        LOGGER.info("\nDeleted google for Alla from personAccountsMap: " + personAccountsMap);

        // Delete a person
        accountControl.deletePerson(personAccountsMap, alfred);
        LOGGER.info("\nDeleted Person 'Alfred' from personAccountsMap: " + personAccountsMap);

        //Show the entire map of people and their accounts.
        LOGGER.info("\nShow all Map with Persons and their Accounts: ");
        accountControl.showAllMap(personAccountsMap);

        //Show the all account of alex
        LOGGER.info("\nAll  available accounts for person John: ");
        accountControl.showAllAccountsForPerson(personAccountsMap, john);

    }
}
