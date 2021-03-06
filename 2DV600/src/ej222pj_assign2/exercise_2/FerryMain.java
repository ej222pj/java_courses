/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1.exercise_2
 * 
 * @file_name Vehicle.java
 */
package ej222pj_assign2.exercise_2;

/**
 * @author Eric
 *
 * @date 13 sep 2016 : @time 13:03:22
 *
 */
public class FerryMain {

	public static void main(String[] args) {
        FerryClass ferryClass = new FerryClass();
        System.out.println(ferryClass.toString());
        
        /*
         * Test "201 Bikes" 
         */
        System.out.println("TEST '201 Bikes'!!");
        for (int i = 0; i < 201; i++){
            ferryClass.embark(new Bicycle(1));
        }
        System.out.println(ferryClass.toString());
        System.out.println("Disembarked the ferry\n");
        ferryClass.disembark();
        /*
         * End "201 Bikes"
         */
        
        /*
         * Test "Random Embarks" 
         */
        System.out.println("TEST 'RANDOM EMBARKS'!!");
        ferryClass.embark(new Bicycle(1));
        
        for (int i = 0; i < 20; i++){
            ferryClass.embark(new Car(3));
        }
        
        ferryClass.embark(new Lorry(2));
        ferryClass.embark(new Bus(20));
        ferryClass.embark(new Bus(19));
        
        for (int i = 0; i < 19; i++){
        	ferryClass.embark(new Bicycle(1));
        }
        
        System.out.println(ferryClass.toString());
        System.out.println("Disembarked the ferry");
        ferryClass.disembark();
        /*
         * End "Random Embarks"
         */
        
        /*
         * Test "10 Busses" 
         */
        System.out.println("TEST '10 BUSSES'!!");        
        for (int i = 0; i < 10; i++){
            ferryClass.embark(new Bus(20));
        }

        
        System.out.println(ferryClass.toString());
        System.out.println("Disembarked the ferry");
        ferryClass.disembark();
        /*
         * End "10 Busses" 
         */
        
        System.out.println(ferryClass.toString());
    }
}
