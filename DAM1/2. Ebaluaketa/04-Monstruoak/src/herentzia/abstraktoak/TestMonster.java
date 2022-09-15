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
public class TestMonster {
      public static void main(String[] args) {
      // Program at the specification defined in the superclass/interface.
      // Declare instances of the superclass, substituted by subclasses.
      herentzia.Monster m1 = new herentzia.FireMonster("r2u2");   // upcast
      herentzia.Monster m2 = new herentzia.WaterMonster("u2r2");  // upcast
      herentzia.Monster m3 = new herentzia.StoneMonster("r2r2");  // upcast

      // Invoke the actual implementation
      System.out.println(m1.attack());  // Run FireMonster's attack()
      //Attack with fire!
      System.out.println(m2.attack());  // Run WaterMonster's attack()
      //Attack with water!
      System.out.println(m3.attack());  // Run StoneMonster's attack()
      //Attack with stones!

      // m1 dies, generate a new instance and re-assign to m1.
      m1 = new herentzia.StoneMonster("a2b2");  // upcast
      System.out.println(m1.attack());  // Run StoneMonster's attack()
      //Attack with stones!

      // We have a problem here!!!
     // herentzia.Monster m4 = new Monster("u2u2"); //Monster clasea ezin da instantziatu abstraktua delako
      System.out.println(m3.attack());  // garbage!!!
      //!^_&^$@+%$* I don't know how to attack!
      
     herentzia.Monster m5 = new herentzia.FilthyWaterMonster("Fernando");
       System.out.println(m5.attack());
      
   }
}


