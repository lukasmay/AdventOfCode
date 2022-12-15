import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util

public class Day15{

    public static void main(String[] args) {

    		part1();
    		//part2();
    	}

        public static void part1(){
            String line = "";
            String sencor = "";
            String beacon = "";
            int distance = 0;
            int maxX = 0;
            int maxY = 0;
            int minX = 0;
            int minY = 0;
            ArrayList<Integer[]> location = new ArrayList<>();
            try {
                Scanner scanner = new Scanner(new File("2022/input/day15.txt"));
                Integer[] sencorLocation = {0, 0};
                Integer[] beaconLocation = {0, 0};
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    sencor = line.substring(10, line.indexOf(":"));
                    beacon = line.substring(line.lastIndexOf("x"));

                    sencorLocation[0] = Integer.valueOf(sencor.substring(sencor.indexOf("="), sencor.indexOf(",")));
                    sencorLocation[1] = Integer.valueOf(sencor.substring(sencor.lastIndexOf("=")));
                    
                    beaconLocation[0] = Integer.valueOf(beacon.substring(beacon.indexOf("="), beacon.indexOf(",")));
                    beaconLocation[1] = Integer.valueOf(beacon.substring(beacon.lastIndexOf("=")));

                    distance = Math.abs(sencorLocation[0] - beaconLocation[0]) + Math.abs(sencorLocation[1] - beaconLocation[1]);

                    location.add(sencorLocation);
                    location.add(beaconLocation);

                    if (maxX < sencorLocation[0]){
                        maxX = sencorLocation[0];
                    } else if (maxX < beaconLocation[0]){
                        maxX = beaconLocation[0];
                    } else if (maxY < beaconLocation[1]){
                        maxY = beaconLocation[1];
                    } else if (maxY < sencorLocation[1]){
                        maxY = sencorLocation[1];
                    } else if (minX > beaconLocation[0]){
                        minX = beaconLocation[0];
                    } else if (minX > sencorLocation[0]){
                        minX = sencorLocation[0];
                    } else if (minY > beaconLocation[1]){
                        minY = beaconLocation[1];
                    } else if (minY > beaconLocation[1]){
                        minY = beaconLocation[1];
                    }
                }
            scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            int width = Math.abs(maxX - minX);
            int height = Math.abs(maxY - minY); 
            int[][] map = new int[width][height];

            //for all the values subtract the minX and Y to make those 0.
            

        }

        
}