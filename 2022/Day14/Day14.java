import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day14{

    public static void main(String[] args) {

    		part1();
    		//part2();
    	}

        public static void part1(){
            String line = "";
            String[] holder1 = {"", ""};
            
            
            try {
                Scanner scanner = new Scanner(new File("2022/input/day14.txt"));
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    String[] rockLinePostition = line.split(" ");
                    int[] rockLine = new int[rockLinePostition.length*2];
                    int count = 0;
                    for (int i = 0; i < rockLinePostition.length; i++){
                       holder1 = rockLinePostition[i].split(",");
                       rockLine[count] = Integer.valueOf(holder1[0]);
                       count++;
                       rockLine[count] = Integer.valueOf(holder1[1]);
                       count++;
                    }


                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
}