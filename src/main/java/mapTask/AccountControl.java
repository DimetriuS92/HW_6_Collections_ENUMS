package mapTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;


public class AccountControl {
    public static Logger LOGGER = LogManager.getLogger(AccountControl.class);

    public Map addAccountToTheList(Map map, Person person, Account account) {
        person.accountsList.add(account);
        map.put(person, person.accountsList);
        return map;
    }

    public Map deleteAccountForPerson(Map map, Person person, String accountName) {
        for (int i = 0; i < person.accountsList.size(); i++) {
            if ((person.accountsList.get(i).name.equalsIgnoreCase(accountName))) {
                person.accountsList.remove(i);
                i--;
            }
        }
        map.put(person, person.accountsList);
        return map;
    }

    public Map deletePerson(Map map, Person person) {
        map.remove(person);
        return map;
    }

    public void showAllMap(Map map) {
        LOGGER.info(map);
    }

    public void showAllAccountsForPerson(Map map, Person person) {
        for (Account account : person.accountsList) {
            LOGGER.info(account);
        }
    }
}
