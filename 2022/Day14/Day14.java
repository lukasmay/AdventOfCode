import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class Day14{

    public static void main(String[] args) {

    		part1();
    		//part2();
    	}

        public static void part1(){
            String line = "";
            String[] holder1 = {"", ""};
            HashMap<String, String> map = new HashMap<>();
            
            
            try {
                Scanner scanner = new Scanner(new File("2022/input/day14.txt"));
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    String[] rockLinePostition = line.split(" ");
                    int[][] rockLine = new int[rockLinePostition.length][2];
                    for (int i = 0; i < rockLinePostition.length; i++){
                       holder1 = rockLinePostition[i].split(",");
                       rockLine[i][0] = Integer.valueOf(holder1[0]);
                       rockLine[i][1] = Integer.valueOf(holder1[1]);
                    }
                    for (int i = 0; i < rockLine.length; i++){
                        if (rockLine[i][0] - rockLine[i+1][0] < 0){
                            for (int a = 0; a < Math.abs(rockLine[i][0] - rockLine[i+1][0]); a++){
                                map.put((rockLine[i][0] + a) + "," + rockLine[i][1], "#");
                            }
                        } else if (rockLine[i][0] - rockLine[i+1][0] > 0){
                            for (int a = 0; a < Math.abs(rockLine[i][0] - rockLine[i+1][0]); a++){
                                map.put((rockLine[i][0] - a) + "," + rockLine[i][1], "#");
                            }
                        } else if (rockLine[i][1] - rockLine[i][1] == 0){
                            for (int a = 0; a < Math.abs(rockLine[i][0] - rockLine[i+1][0]); a++){
                                map.put((rockLine[i][1] + a) + "," + rockLine[i][1], "#");
                            }
                        } else {
                            for (int a = 0; a < Math.abs(rockLine[i][0] - rockLine[i+1][0]); a++){
                                map.put((rockLine[i][1] - a) + "," + rockLine[i][1], "#");
                            }
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            
        }
}