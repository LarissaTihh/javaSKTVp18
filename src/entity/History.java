/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author user
 */
public class History {
    private Book book;
    private Reader reader;
    private Date takeOn;
  private Date returnDate;
  
  
   public History(){
       
   }

    public History(Book book, Reader reader, Date takeOn, Date returnDate) {
        this.book = book;
        this.reader = reader;
        this.takeOn = takeOn;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getTakeOn() {
        return takeOn;
    }

    public void setTakeOn(Date takeOn) {
        this.takeOn = takeOn;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
        
    }

    @Override
    public String toString() {
        return "History{" + "book=" + book + ", reader=" + reader + ", takeOn=" + takeOn + ", returnDate=" + returnDate + '}';
    }
   } 

