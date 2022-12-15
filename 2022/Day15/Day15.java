import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day15{

    public static void main(String[] args) {

    		part1();
    		//part2();
    	}

        public static void part1(){
            String line = "";
            try {
                Scanner scanner = new Scanner(new File("2022/input/day15.txt"));
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();

                }
            scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
}