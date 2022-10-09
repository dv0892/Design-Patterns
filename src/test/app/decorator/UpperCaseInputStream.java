package test.app.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream  extends FilterInputStream {

	protected UpperCaseInputStream(InputStream in) {
		super(in);
	}

	public int read() throws IOException{
		int c = in.read();
		return c == -1 ? -1 : Character.toUpperCase(c);
	}
	
	
	
	public int read(byte b[], int off, int len) throws IOException{
		int result = in.read(b,off,len);
		for( int i=off;i<off+result;i++) {
			b[i] = (byte) Character.toUpperCase(b[i]);
		}
		
		return result;
	}
}
