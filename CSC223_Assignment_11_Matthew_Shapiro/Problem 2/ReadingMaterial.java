/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 9 Problem 9.3       **********/
/**********     Date Last Modified: 2016-12-08              **********/
/*********************************************************************/

import java.util.ArrayList;
import java.util.List;

abstract class ReadingMaterial {

    protected String title, language;
    protected int pageCount;
    protected List<Person> authors;

    // full constructor
    public ReadingMaterial(String title, int pageCount, String language, Person[] authors) {
        this(title, pageCount, language);
        this.authors = new ArrayList<Person>();
        this.addAuthors(authors);
    }

    // full constructor
    public ReadingMaterial(String title, int pageCount, String language, Person author) {
        this(title, pageCount, language);
        this.authors = new ArrayList<Person>();
        this.addAuthors(author);
    }

    // full constructor
    public ReadingMaterial(String title, int pageCount, String language, List<Person> authors) {
        this(title, pageCount, language);
        this.authors = new ArrayList<Person>();
        this.addAuthors(authors);
    }

    public ReadingMaterial(String title, int pageCount, String language) {
        this.title = title;
        this.pageCount = pageCount;
        this.language = language;
    }

    // // 2-arg constructor uses English as default language, no authors
    // public ReadingMaterial(String title, int pageCount, Person[] authors) {
    //     this(title, pageCount, "English");
    // }

    protected void addAuthors(List<Person> authors) {
        this.authors.addAll(authors);
    }

    protected void addAuthors(Person[] authors) {
        for (Person author : authors) {
            this.authors.add(author);
        }
    }

    protected void addAuthors(Person author) {
        this.authors.add(author);
    }

    public Person[] getAuthorsAsArray() {
        // must pass toArray() a typed array or it returns array
        // of Object[] type
        return this.authors.toArray(new Person[0]);
    }

    public List<Person> getAuthorsAsList() {
        return this.authors;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getLanguage() {
        return language;
    }

}