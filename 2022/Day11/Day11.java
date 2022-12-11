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
        String[] data = new String[6];
        int counter = 0;
        ArrayList<Monkey> monkeys = new ArrayList<>();

        String name = "";
        ArrayList<Integer> items = new ArrayList<>();
        String operation = "";
        String test = "";
        String ifTrue = "";
        String ifFalse = "";

        try {
            Scanner scanner = new Scanner(new File("2022/input/day8.txt"));
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                data[counter] = line;
                if (counter == 6){

                    //Input the name for the ifTrue false stuff then a search could be done to add them the item thrown
                    name = data[0];
                    items.add(Integer.valueOf(data[1].substring(18, data[1].indexOf(","))));
                    //starting items 
                    //I need to parse the lines to get the data that I want
                    //Use the variables above to store the data
                    //This is where the monkey will be created
                    monkeys.add(new Monkey());
                    counter = 0;
                }
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
