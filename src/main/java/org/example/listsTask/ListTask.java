package org.example.listsTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class ListTask {
    public static final Logger LOGGER = LogManager.getLogger(ListTask.class);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> lists = new ArrayList<>();
        LOGGER.error("Enter words until you enter the word - break");
        LOGGER.error("Enter word:");
        String name = in.nextLine();
        while (!Objects.equals(name, "break")){
            lists.add(name);
            LOGGER.error("Enter word:");
            name = in.nextLine();
        }

        LOGGER.error("********\nTask 1********");
        for(String list : lists){
            LOGGER.error(list);
        }

        LOGGER.error("\n********Task 2********");
        for (String word : lists){
            if (word.startsWith("s")){
                LOGGER.error(word);
            }
        }

        LOGGER.error("\n********Task 3********");
        for (String word : lists) {
            if(word.length()>5) {
                LOGGER.error(word);
            }
        }
    }
}


