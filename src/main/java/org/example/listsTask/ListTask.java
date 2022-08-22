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
        LOGGER.info("Enter words until you enter the word - break");
        LOGGER.info("Enter word:");
        String name = in.nextLine();
        while (!Objects.equals(name, "break")){
            lists.add(name);
            LOGGER.info("Enter word:");
            name = in.nextLine();
        }

        LOGGER.info("\n********All list********");
        for(String list : lists){
            LOGGER.info(list);
        }

        LOGGER.info("\n********Starts with 'S'********");
        for (String word : lists){
            if (word.startsWith("s")){
                LOGGER.info(word);
            }
        }

        LOGGER.info("\n********More than 5 symbols********");
        for (String word : lists) {
            if(word.length()>5) {
                LOGGER.info(word);
            }
        }
    }
}


