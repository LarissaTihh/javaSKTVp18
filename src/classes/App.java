/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {

    public App() {
    }

    @SuppressWarnings("empty-statement")
   public void run() 
           
          
    {
        Scanner scanner = new Scanner(System.in);
        boolean flagExit = true;
        do{
        System.out.println("spisok zada4:");
            System.out.println("0. zakrit programmu");
        System.out.println("1. Novaja kniga");
        System.out.println("2. Novii 4itatel");
        System.out.println("3. Spisok knig");
        System.out.println("4. spisok 4itatelei");
        System.out.println("5. vidat knigu");
        System.out.println("6. vernut knigu");
        System.out.println("Viberite nomer zadati:");
        String numberTask = scanner.nextLine();
        
        if ("0".equals(numberTask()){
            flagExit = false;
       
            System.out.println("zakan4ivaem ");}
              
            else if ("1".equals(numberTask)){
            System.out.println("vipolhjaem 1 zada4u");}
        else if("2".equals(numberTask)){
            System.out.println("vipolhjaem 2 zada4u");}
        else if("3".equals(numberTask)){
                
            System.out.println("vipolhjaem 3 zada4u");}
        else if("4".equals(numberTask)){
            System.out.println("vipolhjaem 4 zada4u");}
        else if("5".equals(numberTask)){
            System.out.println("vipolhjaem 5 zada4u");}
         else if("6".equals(numberTask)){
             System.out.println("vipolhjaem 6 zada4u");
        }
        }while(flagExit);
//       System.out.println("Привет!");
//        
//        Book book = new Book();
//        book.setTitle(" Viona i mir ");
//        book.setAuthor(" Lev Tolstoy ");
//        book.setYear(2010);
//
//        System.out.println(book.toString());
//        book.setYear(2011);
//        System.out.println(book.getTitle());
//        System.out.println(book.getYear());
//
//        Reader reader = new Reader();
//        reader.setName("Ivan");
//        reader.setLastname("Ivanov");
//        reader.setEmail("ivanov@mail.ru");
//
//        System.out.println(reader.toString());
//
//        System.out.println(reader.getName());
//        
//
//        History history = new History();
//        history.setBook(book);
//        history.setReader(reader);
//        history.setTakeOn(new Date());
//       
//    
//  
//        System.out.println("Vidana kniga: " + history.toString());
//        history.setReturnDate(new Date());
//        System.out.println("Vozvrat knigi: " + history.toString());
    }

    private Object numberTask() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
