/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjects;

/**
 *
 * @author brandon.boburka
 */
public class Lake {
    // begins main
    public static void main(String[] args){
        // introduces fishing rod 1
    FishingRod firstFishingRod = new FishingRod();
    firstFishingRod.baitType = "Worm";
    firstFishingRod.castDistance = 80;
    firstFishingRod.fishCaught = "Bass";
    firstFishingRod.fishLength = 10;
    
        System.out.println("FirstFishingRod's bait type: " + firstFishingRod.baitType);
        System.out.println("FirstFishingRod's cast distance: " + firstFishingRod.castDistance);
        System.out.println("FirstFishingRod's fish caught: " + firstFishingRod.fishCaught);
        System.out.println("FirstFishingRod's fish length: " + firstFishingRod.fishLength);
        System.out.println("");
        // introduces fishing rod 2
    FishingRod secondFishingRod = new FishingRod();
    secondFishingRod.baitType = "Shiner";
    secondFishingRod.castDistance = 120;
    secondFishingRod.fishCaught = "Catfish";
    secondFishingRod.fishLength = 16;
    
        System.out.println("SecondFishingRod's bait type: " + secondFishingRod.baitType);
        System.out.println("SecondFishingRod's cast distance: " + secondFishingRod.castDistance);
        System.out.println("SecondFishingRod's fish caught: " + secondFishingRod.fishCaught);
        System.out.println("SecondFishingRod's fish length: " + secondFishingRod.fishLength);
        System.out.println("");
        // introduces fishing rod 3
    FishingRod thirdFishingRod = new FishingRod();
    thirdFishingRod.baitType = "Power Bait";
    thirdFishingRod.castDistance = 160;
    thirdFishingRod.fishCaught = "Walleye";
    thirdFishingRod.fishLength = 12;
    
        System.out.println("ThirdFishingRod's bait type: " + thirdFishingRod.baitType);
        System.out.println("ThirdFishingRod's cast distance: " + thirdFishingRod.castDistance);
        System.out.println("ThirdFishingRod's fish caught: " + thirdFishingRod.fishCaught);
        System.out.println("ThirdFishingRod's fish length: " + thirdFishingRod.fishLength);
        System.out.println("");
        
    } // close class
    
   } // close main
