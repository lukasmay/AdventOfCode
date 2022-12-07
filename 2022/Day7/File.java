import java.util.ArrayList;

public class File{
	private ArrayList<String> path;
	private int size;
	private String directory;
	private String name;

	public File(ArrayList<String> path, int size, String directory, String name){
		this.path = path;
		this.size = size;
		this.directory = directory;
		this.name = name;
	}
	public File(){

	}
	public File(int size, String directory, String name){
		this.size = size;
		this.name = name;
		this.directory = directory;
	}

	public ArrayList<String> getPath() {
		return this.path;
	}

	public void setPath(ArrayList<String> path) {
		this.path = path;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDirectory() {
		return this.directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	
}