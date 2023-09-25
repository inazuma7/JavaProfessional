package Day10;


public class FileParseException extends Exception {
	
	
	private int lineNum;
	
	public static void main(String [] args) throws FileParseException{
		throw new FileParseException("Cannot read setting",75);
	}
	
	public FileParseException(String msg, int lineNum) {
		super(msg + " (at line " +lineNum +")");
		this.lineNum = lineNum;
	} 
	
	public int getLineNum() {
		return lineNum;
	
	}
	
}
