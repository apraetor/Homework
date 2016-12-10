/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 9 Problem 9.3       **********/
/**********     Date Last Modified: 2016-12-08              **********/
/*********************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


class Problem2 {

    public static void main(String[] args) {
        List<ReadingMaterial> library = new ArrayList<>();

        // some fake author objects
        Person p1 = new Person("Schmoe", "Joe");
        Person p2 = new Person("Gaiman", "Neil");
        Person p3 = new Person("Stephenson", "Neal");
        
        // list of authors
        List<Person> authorList = new ArrayList<>();
        authorList.add(new Person("Cormen", "Thomas"));
        authorList.add(new Person("Leiserson", "Charles"));
        authorList.add(new Person("Rivest", "Ronald"));
        authorList.add(new Person("Stein", "Clifford"));

        // maps of articles and pages
        Map<Person, List<String>> articlesByAuthor = new HashMap<>();
        Map<String, List<Integer>> pagesByTitle = new HashMap<>();
        List<String> titles = new ArrayList<>();
        titles.add("Article One");
        titles.add("Article Two");
        articlesByAuthor.put(p1, titles);
        // list of pages belonging to an article in magazine
        List<Integer> articleOnePages = new ArrayList<>();
        // add the page numbers
        articleOnePages.add(21);
        articleOnePages.add(22);
        // add the page list to table of contents
        pagesByTitle.put("some article", articleOnePages);
        // repeat for second article
        List<Integer> articleTwoPages = new ArrayList<>();
        articleTwoPages.add(37);
        articleTwoPages.add(38);
        pagesByTitle.put("another article", articleTwoPages);

        library.add(new Book("Harper", "June 2015", "Sevenes", 500, "English", p3));
        library.add(new Novel("Fantasy", "Hachette", "October 2013", "The Ocean at the End of the Lane", 450, "English", p2));
        library.add(new Textbook("Computer Science", "The MIT Press", "July 14, 1990", "Introduction to Algorithms", 1292, "English", authorList));
        Magazine rag = new Magazine("Random Magazine", 42, "English", p1, articlesByAuthor, pagesByTitle);
        library.add(rag);
        
        // print out a list of reading material in the library
        String format = "Title: %s  Pages: %d  Authors: %s\n";
        for (ReadingMaterial b : library) {
            System.out.format(format, b.getTitle(), b.getPageCount(), b.getAuthorsAsList());
        }

        // print out some magazine info
        System.out.println("\nArticles in Magazine: ");
        for (String s : rag.getTableOfContents()) {
            System.out.println(s);
        }

    }
}