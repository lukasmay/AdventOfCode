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
        boolean moreInput = true;
        int cycle = 0;
        int inputIndex = 0;
        int inputDuration = 1;
        int strength = 0;
        int holdStrength = 0;
        int totalStrength = 0;
        int multiplicity = 0;

        while (moreInput){
            cycle++;
            inputDuration--;
            if (inputDuration == 0){
                holdStrength += strength;
                if (inputs.get(inputIndex).substring(0, 1).equals("a")){
                    inputDuration = 2;
                    strength = Integer.valueOf(inputs.get(inputIndex).substring(5));
                } else {
                    inputDuration = 1;
                }
                inputIndex++;
                if (inputIndex == inputs.size()){
                    moreInput = false;
                }
                
            }
            if (((cycle-20)%40) == 0){
                totalStrength += holdStrength * (20 + (40 * multiplicity));
                System.out.print(holdStrength);
                System.out.println(" "+totalStrength);
                multiplicity++;
            }
            
        }
        System.out.println(totalStrength);
    }
    
}
