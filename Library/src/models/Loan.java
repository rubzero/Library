package models;

import java.sql.Date;

/**
 * @author Rubzer
 */

public class Loan {
    
    private int id;
    private String studentCod, bookCod, status;
    private Date loanDate, refundDate;
    
    public Loan(){
        
    }
    
    public Loan(int id, String studentCod, String bookCod, Date loanDate,
            Date refundDate, String status){
        this.id = id;
        this.studentCod = studentCod;
        this.bookCod = bookCod;
        this.loanDate = loanDate;
        this.refundDate = refundDate;
        this.status = status;
    }
    
    public Loan(String studentCod, String bookCod, Date loanDate,
            Date refundDate, String status){
        this.studentCod = studentCod;
        this.bookCod = bookCod;
        this.loanDate = loanDate;
        this.refundDate = refundDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentCod() {
        return studentCod;
    }

    public void setStudentCod(String studentCod) {
        this.studentCod = studentCod;
    }

    public String getBookCod() {
        return bookCod;
    }

    public void setBookCod(String bookCod) {
        this.bookCod = bookCod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
    }
    
    
}
