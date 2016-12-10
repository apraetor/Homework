/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 9 Problem 9.3       **********/
/**********     Date Last Modified: 2016-12-08              **********/
/*********************************************************************/

import java.util.List;
import java.util.ArrayList;

class Textbook extends Book {

    // assumption: Textbooks are a book with a topic/subject
    protected String topic;

    public Textbook(String topic, String publisher, String publicationDate, String title, int pageCount, String language, Person[] authors) {
        super(publisher, publicationDate, title, pageCount, language, authors);
        this.topic = topic;
    }

    public Textbook(String topic, String publisher, String publicationDate, String title, int pageCount, String language, Person authors) {
        super(publisher, publicationDate, title, pageCount, language, authors);
        this.topic = topic;
    }

    public Textbook(String topic, String publisher, String publicationDate, String title, int pageCount, String language, List<Person> authors) {
        super(publisher, publicationDate, title, pageCount, language, authors);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
}