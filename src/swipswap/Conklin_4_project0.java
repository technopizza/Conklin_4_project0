/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swipswap;

/**
 *
 * @author jconklin2391
 */
public class Conklin_4_project0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            for(int i=0; i < 501; i++){
                SwippitySwappityBippityBoppityHippityHoppityFlippityFloppity(i);
            }
    }

    static void SwippitySwappityBippityBoppityHippityHoppityFlippityFloppity(int number) {
        boolean byTwo = isDivisibleByTwo(number);
        boolean byThree = isDivisibleByThree(number);
        boolean byFive = isDivisibleByFive(number);
        boolean byEleven = isDivisibleByEleven(number);
        if(byTwo && byThree && byFive){
            System.out.println("Team Building");
            return;
        }
        else if(byTwo && byThree && !(byFive)){
             System.out.println("chisme");
             return;
        }
        else if(!(byTwo) && byThree && byFive){
             System.out.println("Old School");
             return;
        }
        else if(byTwo){
            if(byEleven){
            System.out.println("ninja");
            return;
            }
            System.out.println("Davis");
            return;
        }
        else if(byThree){
            if(byEleven){
            System.out.println("Herr Direktor");
            return;
            }
            System.out.println("Claughton");
            return;
        }
        else if(byFive){
            if(byEleven){
            System.out.println("Animate This!");
            return;
            }
             System.out.println("Vidal");
             return;
        }
        System.out.println(number);
    }

    static boolean isDivisibleByTwo(int number) {
        return (number % 2 == 0);
    }

    static boolean isDivisibleByThree(int number) {
        return (number % 3 == 0);
    }

    static boolean isDivisibleByFive(int number) {
        return (number % 5 == 0);
    }
    static boolean isDivisibleByEleven(int number) {
        return (number % 11 == 0);
    }

}
