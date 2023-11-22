package controller;

import model.WordSet;

/**
 * @author Seyma Kanat <s.kanat@st.hanze.nl>
 * Collections for text
 */
public class CollectionsLauncher {
    public static void main(String[] args) {

        WordSet wordSet = new WordSet(); //Init.

        wordSet.readFromFile("src/resources/Text.txt");

        System.out.println(wordSet.getWordsSorted());

        System.out.println( wordSet.getNrOfUniqueWords());

    }
}