import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day10 {
   public static void main(String[] args) {
        
		part1();
		//part2();
	}

    public static void part1(){
        String line = "";
        ArrayList<String> inputs = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("2022/input/day10.txt"));
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                inputs.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Loop through the inputs for the running stuff
    }
    
}
