/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Author;
import model.Book;
import model.Komikia;

/**
 *
 * @author olivas.hodei
 */
public class TestNolakoa {
    public static void main(String[] args) {
        Author i = new Author ("pepe",'m');
        Book librua1 = new Book("",i,95.65,12);
        Book liburua2 = new Komikia(true,"mortadelo",i,99.99,75);
        
    }
    
}
