package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


/**
 * @author Seyma Kanat <s.kanat@st.hanze.nl>
 * Purpose of the program
 */
public class WordSet {
    Set<String> wordset = new HashSet<>();

    public WordSet() {
    }

    public void readFromFile(String filenaam) {
        try {
            File textFile = new File(filenaam);
            Scanner textFilescanner = new Scanner(textFile);

            while (textFilescanner.hasNextLine()) {

                String wordToSave = textFilescanner.next();
                wordToSave = wordToSave.replaceAll("[^a-zA-Z0-9\\s]", "");

               wordset.add(wordToSave.toLowerCase());

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public int getNrOfUniqueWords() {

        return wordset.size();
    }

    public Iterable<String> getWordsSorted() {

        ArrayList<String> unsortedList = new ArrayList<>(wordset); //create list

        Collections.sort(unsortedList);

        return unsortedList;
    }

}
