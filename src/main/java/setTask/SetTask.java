package setTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class SetTask {
    public static final Logger LOGGER = LogManager.getLogger(SetTask.class);
    public static void main(String[] args) {
        Set<Pupils> set = new HashSet <>();
        Pupils pupils = new Pupils(12, "A", "Jack");
        Pupils pupils1 = new Pupils(11, "B", "Jack");
        Pupils pupils2 = new Pupils(10, "C", "Jack");
        Pupils pupils3 = new Pupils(9, "D", "Jack");
        Pupils pupils4 = new Pupils(8, "E", "Jack");
        Pupils pupils5 = new Pupils(7, "F", "Jack");
        Pupils pupils6 = new Pupils(6, "G", "Jack");
        Pupils pupils7 = new Pupils(5, "H", "Jack");
        set.add(pupils);
        set.add(pupils1);
        set.add(pupils2);
        set.add(pupils3);
        set.add(pupils4);
        set.add(pupils5);
        set.add(pupils6);
        set.add(pupils7);
        LOGGER.info("\nSet before sorting - " + set);

        List<Pupils> listPupils = new ArrayList<>(set);
        Collections.sort(listPupils);

        LOGGER.info("\nSet after sorting - " + listPupils);
        Set<Pupils> pupilsTreeSet = new TreeSet<>();
        pupilsTreeSet.add(pupils);
        pupilsTreeSet.add(pupils1);
        pupilsTreeSet.add(pupils2);
        pupilsTreeSet.add(pupils3);
        pupilsTreeSet.add(pupils4);
        pupilsTreeSet.add(pupils5);
        pupilsTreeSet.add(pupils6);
        pupilsTreeSet.add(pupils7);
        LOGGER.info("Tree set before sorting - "  + pupilsTreeSet);
        List<Pupils> pupilsTreeList = new ArrayList<>(pupilsTreeSet);
        Collections.sort(pupilsTreeList);
        LOGGER.info("Tree set after sorting - " + pupilsTreeList);


    }
}
