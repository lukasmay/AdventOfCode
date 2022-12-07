public class File{
	private String[] path;//Switch to arraylist
	private int size;
	private String directory;

	public File(String[] path, int size, String directory){
		this.path = path;
		this.size = size;
		this.directory = directory;
	}

	public String[] getPath() {
		return path;
	}

	public void setPath(String[] path) {
		this.path = path;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	
}