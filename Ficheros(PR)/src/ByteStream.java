

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) throws IOException {

		FileInputStream in = null;

		try {
			int c;
			in = new FileInputStream("src/ByteStream.java");

			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}
}