/*
Write a program that will allow a robot to assemble 25 burritos. Use a random generator for each burrito option and
build a list of 25 burrito customizations:

Rice: white, brown, none, all
Meat: chicken, steak, carnidas, chorizo, sofritas, veggies, none, all
Beans: pinto, black, none
Salsa: mild, medium, hot, none, all
Veggies: lettuce, fajita veggies, none, all
Cheese: yes/no
Guac: yes/no
Queso: yes/no
Sour cream: yes/no

Randomly generate a number of ingredients per burrito. Each burrito should have a minimum of 5 ingredients and a
maximum of 9 ingredients. Save the finished burritos and display the contents.

Calculate and display a price for each burrito. Pricing will be $3.00 plus 0.50 for each additional ingredient.

If you're finished with above before 3pm, modify your program to use methods. For example, you can call a method from
main whose sole purpose is to calculate the price of the burrito.



Sample Output (Your actual output may vary):

Burrito 0: brown rice, chicken, pinto beans, no salsa, lettuce, fajita veggies, guac, queso, sour cream	 $7.00

Burrito 1: no rice, sofritas, no beans, medium salsa, fajita veggies	 $4.50

Burrito 2: brown rice, carnidas, no beans, medium salsa, fajita veggies, cheese, guac	 $6.00

Burrito 3: no rice, chicken, black beans, hot salsa, lettuce, fajita veggies	 $5.50

Burrito 4: brown rice, steak, pinto beans, no salsa, fajita veggies, sour cream	 $5.50

Burrito 5: brown rice, veggies, pinto beans, no salsa, fajita veggies, sour cream	 $5.50

Burrito 6: white rice, sofritas, black beans, hot salsa, fajita veggies, guac, queso, sour cream	 $7.00

Burrito 7: white rice, carnidas, no beans, medium salsa, lettuce, guac, queso	 $6.00

Burrito 8: white rice, steak, black beans, no salsa, lettuce, fajita veggies, queso, sour cream	 $6.50

Burrito 9: brown rice, carnidas, no beans, medium salsa, lettuce, queso	 $5.50

Burrito 10: no rice, chorizo, pinto beans, hot salsa, fajita veggies, cheese, queso	 $6.00

Burrito 11: no rice, steak, pinto beans, hot salsa, fajita veggies	 $5.00

Burrito 12: brown rice, veggies, no beans, hot salsa, fajita veggies, queso	 $5.50

Burrito 13: white rice, sofritas, black beans, mild salsa, no veggies, sour cream	 $5.50

Burrito 14: no rice, chicken, no beans, medium salsa, lettuce, fajita veggies, sour cream	 $5.50

Burrito 15: no rice, carnidas, pinto beans, mild salsa, medium salsa, hot salsa, fajita veggies, cheese, guac, queso	 $7.50

Burrito 16: brown rice, chicken, black beans, hot salsa, no veggies, queso, sour cream	 $6.00

Burrito 17: no rice, carnidas, pinto beans, mild salsa, medium salsa, hot salsa, fajita veggies, guac	 $6.50

Burrito 18: white rice, chicken, black beans, medium salsa, no veggies, cheese, guac, sour cream	 $6.50

Burrito 19: no rice, chicken, no beans, mild salsa, fajita veggies, queso, sour cream	 $5.50

Burrito 20: white rice, veggies, black beans, mild salsa, medium salsa, hot salsa, no veggies	 $6.00

Burrito 21: brown rice, chicken, pinto beans, mild salsa, lettuce, fajita veggies	 $6.00

Burrito 22: no rice, carnidas, black beans, no salsa, no veggies, cheese, guac, queso	 $5.50

Burrito 23: brown rice, carnidas, no beans, medium salsa, lettuce, fajita veggies, sour cream	 $6.00

Burrito 24: white rice, chorizo, no beans, mild salsa, no veggies	 $4.50

Burrito 25: white rice, chorizo, black beans, no salsa, lettuce, fajita veggies, queso	 $6.00
 */

import java.util.*;

import static java.util.Collections.*;

public class ChipotleJrPlus {

    // Defining method to return a random element from ArrayList
    public static String findElement(List list){
        String rndElement = (String) list.get((int) (Math.random() * list.size()));
//        System.out.println("\n--------------------------------------------");
//        System.out.println("Getting random value from ArrayList: " + rndElement);
//        System.out.println("--------------------------------------------");
        return rndElement;
    }

    public static void main(String[] args){


        ArrayList al = new ArrayList(25);

        Scanner input = new Scanner(System.in);

        List<String> Rice = Arrays.asList("white_rice", "brown_rice", "none", "all");
        List<String> Meat = Arrays.asList("chicken", "steak","carnidas", "chorizo", "sofritas", "veggies", "none", "all");
        List<String> Beans = Arrays.asList("pinto", "black", "none");
        List<String> Salsa = Arrays.asList("mild_salsa", "medium_salsa", "hot_salsa","none", "all");
        List<String> Veggies = Arrays.asList("lettuce", "fajita_veggies","none", "all");
        String cheese;
        String Guac;
        String Queso;
        String Sour_Cream;


        //Selecting rice randomly
        String rice = (String)findElement(Rice);
        String meat = (String)findElement(Meat);
        String beans = (String)findElement(Beans);
        String salsa = (String)findElement(Salsa);
        String veggies = (String)findElement(Veggies);


        // Making burrito

        ArrayList<String> burrito = new ArrayList<String>();
            burrito.add(rice);
            burrito.add(meat);
            burrito.add(beans);
            burrito.add(salsa);
            burrito.add(veggies);
            burrito.add("cheese");
            burrito.add("Guac");
            burrito.add("Queso");
            burrito.add("Sour_Cream");

       // for(String s: burrito) {
            //Random r = new Random();
            //int rndNum = r.nextInt(4)+5;
            //burrito.remove(rndNum);
            //myBurrito.add(s);
            //for(int i =0; i<=rndNum; i++) {
              //  myBurrito.add(burrito.get(rndNum));
           // }

       // }

        Random r = new Random();
        int rndNum = r.nextInt(4)+5;

        // use this later good
        //List<String> myBurrito = burrito.subList(0, rndNum);

        //////////////////////////////

        //Adding elements
        List<ArrayList<String>> mainList = new ArrayList<ArrayList<String>>();
        List<String> myBurrito = burrito.subList(0, rndNum);
        for(int i=0;i<10;i++) {
            for(int j=i+1;j<10;j++){
                //Do something and add elements to subList
                // subList.add(element[j]) }
            //mainList.add(subList);

            // When I clear subList mainList is also getting cleared. I want to add the elements of subList to mainList. I was able to do it with loops but how to do this way
            //subList.clear();
        //}

        //Printing, How do I get the elements from mainList which will have subLists
        for(Integer i:mainList){
            System.out.println(i);
        }
    }



        //System.out.println("Burrito" + burrito);
        System.out.println("My Burrito" + myBurrito);



    }

}
