import java.util.ArrayList;

//This would have a method to add all the FileStuff size up useing a foreach loop.
public class Dir{
	private ArrayList<FileStuff> files = new ArrayList<FileStuff>();
	private ArrayList<Dir> childDir = new ArrayList<Dir>();
	private String path;
	private int size;
	private String name;

	public Dir(ArrayList<FileStuff> files, ArrayList<Dir> childDir, String path, int size, String name) {
		this.files = files;
		this.childDir = childDir;
		this.path = path;
		this.size = size;
		this.name = name;
	}
	public Dir(){

	}
	public Dir(String path, String name){
		this.path = path;
		this.name = name;
		this.size = 0;
	}
	
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}
	public ArrayList<FileStuff> getFiles() {
		return this.files;
	}

	public void setFiles(ArrayList<FileStuff> files) {
		this.files = files;
	}
	public void addFiles(FileStuff file){
		this.files.add(file);
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
	public int sum(){
		int i  = 0;
		for (FileStuff stuff : this.files){
			i += stuff.getSize();
		}
		return i;
	}
}