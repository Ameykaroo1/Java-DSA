import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
  public static void main(String[] args) {

    String filepath ="text.txt ";
    String textContent = "I like pizza!";
    try(FileWriter writer = new FileWriter(filepath)){
      writer.write(textContent);
      System.out.println("File has been written");
    }
    catch(FileNotFoundException e){
      System.out.println("Could not locate file location");
    }
    catch(IOException e){
      System.out.println("Could not write file");
    }
  }
}
