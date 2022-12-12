import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * The way to do this is to create a class for the monkey to store all their data
 * Then loop through all of the rounds
 * When they are done add find the monkey with the most activity.
 *      This would be stored in every monkey
 *      Finding the top two and returning them
 * Each monkey would be stored in an array or arraylist
 * 
 * Shouldn't be to bad
 */

public class Day11 {
    public static void main(String[] args) {
        
		part1();
		//part2();
	}

    public static void part1(){
        String line = "";
        String[] data = new String[7];
        int counter = 0;
        ArrayList<Monkey> monkeys = new ArrayList<>();

        String name = "";
        
        ArrayList<Integer> items = new ArrayList<>();
        String operation = "";
        String test = "";
        String ifTrue = "";
        String ifFalse = "";

        try {
            Scanner scanner = new Scanner(new File("2022/input/day11.txt"));
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                
                data[counter] = line;
                if (counter == 6){
                    //Input the name for the ifTrue false stuff then a search could be done to add them the item thrown
                    name = data[0];
                    data[1] = data[1].substring(17);
                    operation = data[2].substring(23);
                    test = data[3].substring(22);
                    ifTrue = data[4].substring(29);
                    ifFalse = data[5].substring(30);
                    //System.out.println(data[1]);
                    String[] holderItem = ((data[1].replaceAll("\\s", "").split(",")));
                    for (String holder : holderItem){
                        //System.out.println(holder);
                        items.add(Integer.valueOf(holder));
                    }
                    monkeys.add(new Monkey(name, items, operation, test, ifTrue, ifFalse));                    
                    counter = -1;
                    
                }
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (Monkey i : monkeys){
            System.out.println(i.print());
         }
    }
}
