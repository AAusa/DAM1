import java.io.*;
import java.util.Scanner;
public class BufferStream {
	public static void main(String[] args) throws IOException {
		Scanner s = null;
		try {
			s = new Scanner(

					new BufferedReader(
							new FileReader("src/BufferStream.java")));

			while (s.hasNext()) {
				System.out.println(s.next());
			}
		}
		finally {
			if (s != null) {
				s.close();
			}
		}
	}
}