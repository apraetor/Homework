/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 9 Problem 9.3       **********/
/**********     Date Last Modified: 2016-12-08              **********/
/*********************************************************************/

import java.util.List;
import java.util.ArrayList;

class Novel extends Book {

    // assumption: novels are a book with a genre
    protected String genre;

    public Novel(String genre, String publisher, String publicationDate, String title, int pageCount, String language, Person[] authors) {
        super(publisher, publicationDate, title, pageCount, language, authors);
        this.genre = genre;
    }

    public Novel(String genre, String publisher, String publicationDate, String title, int pageCount, String language, Person authors) {
        super(publisher, publicationDate, title, pageCount, language, authors);
        this.genre = genre;
    }

    public Novel(String genre, String publisher, String publicationDate, String title, int pageCount, String language, List<Person> authors) {
        super(publisher, publicationDate, title, pageCount, language, authors);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}