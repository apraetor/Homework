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
import java.util.Arrays;
import java.util.Set;

class Magazine extends ReadingMaterial {

    // assumption: magazines have individual articles attributed to authors, vs. the entire book being shared by all
    Map<Person, List<String>> articlesByAuthor;
    Map<String, List<Integer>> pagesByTitle;

    // overloading constructor to handle supplying both a String[] or list of authors
    public Magazine(String title, int pageCount, String language, Person[] authors) {
        super(title, pageCount, language, authors);
        

    }

    public Magazine(String title, int pageCount, String language, Person authors) {
        super(title, pageCount, language, authors);
    }

    public Magazine(String title, int pageCount, String language, List<Person> authors) {
        super(title, pageCount, language);
        

    }

    public Magazine(String title, int pageCount, String language, Person[] authors, Map<Person, List<String>> articlesByAuthor, Map<String, List<Integer>> pagesByTitle) {
        this(title, pageCount, language, authors);
        this.articlesByAuthor = articlesByAuthor;
        this.pagesByTitle = pagesByTitle;

    }

    public Magazine(String title, int pageCount, String language, Person authors, Map<Person, List<String>> articlesByAuthor, Map<String, List<Integer>> pagesByTitle) {
        this(title, pageCount, language, authors);
        this.articlesByAuthor = articlesByAuthor;
        this.pagesByTitle = pagesByTitle;

    }

    public Magazine(String title, int pageCount, String language, List<Person> authors, Map<Person, List<String>> articlesByAuthor, Map<String, List<Integer>> pagesByTitle) {
        this(title, pageCount, language, authors);
        this.articlesByAuthor = articlesByAuthor;
        this.pagesByTitle = pagesByTitle;

    }

    public Set<String> getTableOfContents() {
        return pagesByTitle.keySet();
    }

    public List<String> getArticles(Person p) {
        return articlesByAuthor.get(p);
    }

    public List<Integer> getArticlePages(String title) {
        return pagesByTitle.get(title);
    }

    public void addArticle(Person author, String title, List<Integer> pages) {
        List<String> articles;
        // find the author in articlesByAuthor
        if (!articlesByAuthor.containsKey(author)) {
            articles = new ArrayList<>();
        } else {
            articles = articlesByAuthor.get(author);
        }
        // get author's 
        // add the article to the article list
        articles.add(title);
        // store back to Map
        articlesByAuthor.put(author, articles);

        // now add list of pages
        // this assumes no two articles have the same title (primary key)
        pagesByTitle.put(title, pages);
    }

    public void addArticle(Person author, String title, int[] pages) {
        List<String> articles;
        // find the author in articlesByAuthor
        if (!articlesByAuthor.containsKey(author)) {
            articles = new ArrayList<>();
        } else {
            articles = articlesByAuthor.get(author);
        }
        // get author's 
        // add the article to the article list
        articles.add(title);
        // store back to Map
        articlesByAuthor.put(author, articles);

        
        // this assumes no two articles have the same title (primary key)
        // convert int[] to list
        List<Integer> pagesAsList = new ArrayList<>();
        for (int i : pages) {
            pagesAsList.add(i);
        }
        // now add list of pages to table of contents
        pagesByTitle.put(title, pagesAsList);
    }

}