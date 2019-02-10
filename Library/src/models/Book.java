package models;

/**
 * @author Rubzer
 */

public class Book {
    
    private int code;
    private String title, author, editorial, subject, status;
    
    public Book(){
        
    }
    
    public Book(int code, String title, String author
            , String editorial, String subject, String status){
        this.code = code;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.subject = subject;
        this.status = status;
    }
    
    public String[] getParamArray(){
        return new String[]{code+"", title, author, editorial
                , subject, status};
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
