import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day13{

    public static void main(String[] args) {

    		part1();
    		//part2();
    	}

        public static void part1(){
            String line = "";
            try {
                Scanner scanner = new Scanner(new File("2022/input/day13.txt"));
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    if (line.equals("\n\n")){
                        System.out.println("he");
                    }

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
}