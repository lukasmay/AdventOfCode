import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * The way to do this is to create a class for the money to store all their data
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
        try {
            Scanner scanner = new Scanner(new File("2022/input/day8.txt"));
            while (scanner.hasNextLine()) {
                //Adding Rows to forest
                line = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
