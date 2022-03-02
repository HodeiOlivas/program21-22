/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inplementazioa;


/**
 *
 * @author olivas.hodei
 */
public class StoneMonster implements Monstruosoa {
   /** Constructs a StoneMonster instance with the given name */
    String name;
   public StoneMonster(String name) {
      this.name = name;
   }
   
   @Override
   public String attack() {
      return "Attack with stones!";
   }
}