import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* 
First find out how to get the data from the file. Goal to get a tree mapped out
	
Then find the totals of all directories and add them if they are less than 100,000

overall keep the logic just the storing of the values change

The path isn't needed because the directories will show up in the parent

The hashmap will store the object Dir with a key of dir name

A list will store all of the directory names.

At the end loop through list of dirs to get the size of each and tally them like wanted

The only issue might be getting the dir type with the hashmap to work properly. can always override 
*/
class Main {
	public static void main(String[] args) {
		part1();
	}

	public static void part1(){
		HashMap<String, Dir> dir = new HashMap<String, Dir>();

		ArrayList<String> directories = new ArrayList<String>();
		String line = "";
		String location = "/";
		String currentDir = "";
		boolean getInfo = false;
		Dir workingDir = new Dir();
		try {
			Scanner scanner = new Scanner(new File("2022/Day7/input.txt"));
			while (scanner.hasNextLine()) {
				line = scanner.nextLine();
				if (getInfo && !(line.substring(0, 1).equals("$"))){
					if (line.substring(0, 3).equals("dir")){
						if (!(directories.contains(currentDir))){
							directories.add(currentDir);
						}
						//This needs to be reworked to see if it exists already
						dir.put(currentDir, new Dir(location, line.substring(4, line.length())));
					} else {
						if (dir.get(currentDir) == null){
							dir.put(currentDir, new Dir(location, line.substring(4, line.length())));
						} else {
							workingDir = dir.get(currentDir);
							workingDir.addFiles(new FileStuff(Integer.valueOf(line.substring(0, line.indexOf(" "))), currentDir, line.substring(line.indexOf(" ")+1, line.length())));
							dir.put(currentDir, workingDir);
						}
						
					}
				}				
				if (line.substring(0, 1).equals("$")){
					if (line.substring(2,4).equals("ls")){
						getInfo = true;
					} else if (line.equals("$ cd ..")){
						location = location.substring(0, location.lastIndexOf("@"));
						//currentDir = location.substring(location.lastIndexOf("@"), location.length());
					} else if (line.equals("$ cd /")){
						location = "/";
						currentDir = "/";
					} else {
						location = location + "@" + line.substring(5,line.length());
						currentDir = line.substring(5, line.length());
					}
				}

				
		}
		System.out.println(dir);
		System.out.println();
		System.out.println(dir.size());
		System.out.println(directories.size());
		System.out.println();
		System.out.println(directories);
		for (String i : directories){

		}
		
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void part2(){
		try {
			Scanner scanner = new Scanner(new File("input.txt"));
			while (scanner.hasNextLine()) {

				
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}