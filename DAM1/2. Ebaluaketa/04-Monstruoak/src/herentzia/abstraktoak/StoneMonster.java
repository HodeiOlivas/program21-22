/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herentzia.abstraktoak;



/**
 *
 * @author olivas.hodei
 */
public class StoneMonster extends Monster {
   /** Constructs a StoneMonster instance with the given name */
   public StoneMonster(String name) {
      super(name);
   }
   
   @Override
   public String attack() {
      return "Attack with stones!";
   }
}