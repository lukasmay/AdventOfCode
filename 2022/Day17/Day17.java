import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day17{

    public static void main(String[] args) {

    		part1();
    		//part2();
    	}

        public static void part1(){
            String line = "";
            try {
                Scanner scanner = new Scanner(new File("2022/input/day17.txt"));
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    int rockType = 0;
                    ArrayList<Character[]> map = new ArrayList<>();
                    Character[] row = new Character[7];

                    for (char dir : line.toCharArray()){

                    }

                }
            scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public static char[][] getRock(int type){
            char[][] rock = new char[4][4];
            switch (type){
                case 1:
                    rock[0][0] = '#';
                    rock[0][1] = '#';
                    rock[0][2] = '#';
                    rock[0][3] = '#';
                    break;
                case 2:
                    rock[1][0] = '#';
                    rock[0][1] = '#';
                    rock[1][1] = '#';
                    rock[1][2] = '#';
                    rock[2][1] = '#';
                    break;
                case 3:
                    rock[0][2] = '#';
                    rock[1][2] = '#';
                    rock[2][2] = '#';
                    rock[2][1] = '#';
                    rock[2][0] = '#';
                    break;
                case 4:
                    rock[0][0] = '#';
                    rock[0][1] = '#';
                    rock[0][2] = '#';
                    rock[0][3] = '#';
                    break;
                case 5:
                    rock[0][0] = '#';
                    rock[0][1] = '#';
                    rock[1][0] = '#';
                    rock[1][1] = '#';
                    break;
            }

            return rock;
        }
}