import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Day8 {
    public static void main(String[] args) {
        int sizeOfForest = 5;
		part1(sizeOfForest);
		//part2();
	}
    public static void part1(int sizeOfForest){
        String line = "";
        int counter = 0;
        int totalCounter = 0; //Total number of trees in forest
        int[][] forest = new int[sizeOfForest][sizeOfForest];
        try {
            Scanner scanner = new Scanner(new File("2022/input/day8.txt"));
            while (scanner.hasNextLine()) {
                //Adding Rows to forest
                line = scanner.nextLine();
                char[] ch = line.toCharArray();
                for (int i = 0; i < ch.length; i++){
                    forest[counter][i] = Character.getNumericValue(ch[i]);
                    totalCounter++;
                }
                counter++;
            }

            int solution = 0;
            counter = 0;
            boolean larger = true;
            boolean notAdded = true;
            int value = 0;
            for (int i = 0; i < sizeOfForest; i++){
                for (int a = 0; a < sizeOfForest; a++){ //This will check all the trees through this code
                    if (i == 0 || a == 0 || i == sizeOfForest-1 || a == sizeOfForest-1){ //If tree is on the outside
                        solution++;
                    } else {
                        value = forest[i][a];
                        counter = 0;
                        larger = true;
                        notAdded = true;

                        // This will loop to check if the tree is visible from the left
                        while (larger && a > counter && notAdded){
                            if (value <= forest[i][counter]){
                                larger = false;
                            }
                            counter++;
                        }
                        if (larger && notAdded){//actualy add to total if visible all the way
                            solution++;
                            notAdded = false;
                            System.out.println("Left Location: "+ i + " "+ a);
                        }

                        //This will loop to check visible from the right
                        larger = true;
                        counter++;
                        while (larger &&  sizeOfForest > counter && notAdded){
                            if (value <= forest[i][counter]){
                                larger = false;
                            }
                            counter++;
                        }
                        if (larger && notAdded){
                            solution++;
                            notAdded = false;
                            System.out.println("Right Location: "+ i + " "+ a);
                        }

                        //This will loop to check visible from up
                        counter = 0;
                        larger = true;
                        while (larger && i > counter && notAdded){
                            if (value <= forest[counter][a]){
                                larger = false;
                            }
                            counter++;
                        }
                        if (larger && notAdded){
                            solution++;
                            notAdded = false;
                            System.out.println("Up Location: "+ i + " "+ a);
                        }

                        //Check from down
                        larger = true;
                        counter++;
                        while (larger &&  sizeOfForest > counter && notAdded){
                            if (value <= forest[counter][a]){
                                larger = false;
                            }
                            counter++;
                        }
                        if (larger && notAdded){
                            solution++;
                            notAdded = false;
                            System.out.println("Down Location: "+ i + " "+ a);
                        }
                    }
                }
            }
            
            System.out.println(solution);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
