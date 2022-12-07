import java.util.ArrayList;

//This would have a method to add all the file size up useing a foreach loop.
public class Dir{
	private ArrayList<File> files = new ArrayList<File>();
	private ArrayList<Dir> childDir = new ArrayList<Dir>();
	private String path;
	private int size;
	private String name;

	public Dir(ArrayList<File> files, ArrayList<Dir> childDir, String path, int size, String name) {
		this.files = files;
		this.childDir = childDir;
		this.path = path;
		this.size = size;
		this.name = name;
	}
	public Dir(){

	}
	
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}
	public ArrayList<File> getFiles() {
		return this.files;
	}

	public void setFiles(ArrayList<File> files) {
		this.files = files;
	}

	public ArrayList<Dir> getChildDir() {
		return this.childDir;
	}

	public void setChildDir(ArrayList<Dir> childDir) {
		this.childDir = childDir;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}