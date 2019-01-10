public class MyStringBuilder {


	private static final int BUFFER_MULTIPLIER = 2;
	private static final int DEFAULT_BUFFER_SIZE = 16;


	private char[] str;
	private int size;

	private int charCount;

	//default constructor
	public MyStringBuilder() {
		this.size = DEFAULT_BUFFER_SIZE;
		this.str = new char[DEFAULT_BUFFER_SIZE];
	}


 	//overloading default - with param string
    public MyStringBuilder(String str) {
        this();
        this.append(str);
    }

	//append function
	public MyStringBuilder append(String str) {
	    while (resizeRequired(str)) {
	        resizeBuffer(str);
	    }
	    addString(str);
	    updateCharCount(str.length());
	    return this;
	}
	
	//checking if resizing required
	private boolean resizeRequired(String newInput) {
    return this.charCount + newInput.length() > this.size;
	}

	//resize function
	private void resizeBuffer(String newInput) {
    int oldSize = this.size;
    this.size *= BUFFER_MULTIPLIER; // Update buffer size
    char[] newStr = new char[this.size];
    System.out.printf("Resizing array: Increasing size from %d to %d\n", oldSize, this.size);
    // Copy to new array
    System.arraycopy(this.str, 0, newStr, 0, oldSize);
    // Set new array
    this.str = newStr;
	}

	//appending new string
	private void addString(String str) {
    // Copy elements from string to append into the underlying char array.
    System.arraycopy(str.toCharArray(), 0,
                this.str,  this.charCount , str.length());
	}

	//updating character count
	private void updateCharCount(int charCount) {
    this.charCount += charCount;
	}


	//toString Function
	public String toString() {
		return String.valueOf(this.str);
	}

public int size() {
		return this.charCount;
	}
}

//Credits: JWLee89 - on GitHub