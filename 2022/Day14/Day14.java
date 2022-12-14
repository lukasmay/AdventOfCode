import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

/* I just need to transition to an array[][] for storing the rocks
 *      This will allow for me to loop through the loop
 *      The array will need to be from the max to the minimum
 */
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
                    for (int i = 0; i < rockLine.length -1; i++){
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
            boolean moreSand = true;
            boolean moreMovement = true;
            int[] sandPostition = {500, 0};
            int solution = 0;
            while (moreSand){
                sandPostition[0] = 500; sandPostition[1] = 0;
                solution++;
                while (moreMovement){
                    if (map.get(Integer.toString(sandPostition[0]-1)+ ","+ sandPostition[1]) == null){
                        sandPostition[0]--;
                    } else if (map.get(Integer.toString(sandPostition[0]-1)+ ","+ Integer.toString(sandPostition[1]-1)) == null){
                        sandPostition[0]--;
                        sandPostition[1]++;
                    } else if (map.get(Integer.toString(sandPostition[0]-1)+ ","+ Integer.toString(sandPostition[1]+1)) == null){
                        sandPostition[0]--;
                        sandPostition[1]++;
                    } else {
                        map.put(sandPostition[0] + "," + sandPostition[1], "O");
                        moreMovement = false;
                    }
                    if (sandPostition[0] <= 0){
                        moreSand = false;
                    }
                    System.out.println(sandPostition[0]+ " " + sandPostition[1]);

                }
            }

            System.out.println(solution);
            
        }
}