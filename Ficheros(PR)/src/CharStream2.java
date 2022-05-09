import java.io.FileReader;
import java.io.IOException;

public class CharStream2 {
	public static void main(String[] args) throws IOException {

		FileReader in = null;

		try {
			int c;
			in = new FileReader("src/CharStream.java");

			while ((c = in.read()) != -1)
				if ( c == '\r' )
					System.out.print(" // CR Found");
			System.out.print((char)c);
		}
		finally {
			if (in != null) {
				in.close();
			}
		}
	}
}
