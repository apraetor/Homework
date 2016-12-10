/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 9 Problem 9.3       **********/
/**********     Date Last Modified: 2016-12-08              **********/
/*********************************************************************/

import java.util.List;
import java.util.ArrayList;

class Book extends ReadingMaterial {

    // assumption: publishers are strings -- probably ought to be a class itself
    protected String publisher;
    // this should be a date object, too
    protected String publicationDate;

    // the language should probably be a Language object
    public Book(String publisher, String publicationDate, String title, int pageCount, String language, Person[] authors) {
        super(title, pageCount, language, authors);
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    public Book(String publisher, String publicationDate, String title, int pageCount, String language, Person author) {
        super(title, pageCount, language, author);
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    public Book(String publisher, String publicationDate, String title, int pageCount, String language, List<Person> authors) {
        super(title, pageCount, language, authors);
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    public String getPublisher() {
        return publisher;
    }

}