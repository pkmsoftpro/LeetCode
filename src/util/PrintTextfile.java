package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintTextfile {
  
  public static final String PATH = "/Users/prashant/Desktop/screenshots/temp_workspace/5.5.0_workspace/Leet/src/util/replace.txt";

  public static void main(String[] args) throws IOException {
    // variable declaration
    int ch;

    // check if File exists or not
    try (FileReader fr = new FileReader(PATH)) {
      while ((ch = fr.read()) != -1) {
        if ((char) ch == '[') {
          System.out.print("{");
        } else if ((char) ch == ']') {
          System.out.print("}");
        } else if ((char) ch == '"') {
          System.out.print("'");
        } else if ((char) ch == ' ') {
          System.out.print("");
        } else
          System.out.print((char) ch);
      }
    } catch (FileNotFoundException fe) {
      System.out.println("File not found");
    }
  }
}

