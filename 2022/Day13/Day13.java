import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day13{

    public static void main(String[] args) {

    		part1();
    		//part2();
    	}

        public static String getSection(String packet, int section){
            String beginSection = "";
            String answer = "";
            for (int i = 0; i < section; i++){
            beginSection = packet.substring(0, packet.indexOf("]"));
            answer = beginSection.substring(beginSection.lastIndexOf("[")+1);
            packet = beginSection.substring(beginSection.indexOf("]")+1);
            }
            return answer;
        }

        public static void part1(){
            String line = "";
            String packet1 = "";
            String packet2 = "";
            int lineCounter = 0;
            int solution = 0;
            try {
                Scanner scanner = new Scanner(new File("2022/input/day13.txt"));
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    if (line.trim().equals("")){
                        lineCounter = -1;

                        System.out.println(packet1);
                        
                    } else {
                        if (lineCounter == 0){
                            packet1 = line;
                        } else {
                            packet2 = line;
                        }
                    }
                    lineCounter++;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
}