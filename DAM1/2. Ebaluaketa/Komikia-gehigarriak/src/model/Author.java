package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/* 
 * The Author class model a book's author.
 */
public class Author {
    // The private instance variables

    private String name;
    private char gender;   // 'm' or 'f'
    private LocalDate birthday;

    // The constructor
    public Author(String name, char gender) {
        this.name = name;
        this.gender = gender;

    }

    public Author(String jkRowling, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // The public getters and setters for the private instance variables.
    // No setter for name and gender as they are not designed to be changed.
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

  

     public void setBirthday(String d) {
            this.birthday = LocalDate.parse(d,DateTimeFormatter.ISO_DATE);
      }

    public LocalDate getBirthday() {
        return birthday ;

    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // The toString() describes itself
    @Override
    public String toString() {
        if (birthday != null){
        return name + " (" + gender + ") " + birthday;}
        else{
        
         return name + " (" + gender + ") ";
     
        
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Author other = (Author) obj;
        if (this.gender != other.gender) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.birthday, other.birthday)) {
            return false;
        }
        return true;
    }
    
    
}
                                           
                    
