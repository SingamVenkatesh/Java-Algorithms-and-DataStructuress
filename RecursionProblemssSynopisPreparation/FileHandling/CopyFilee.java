package RecursionProblemssSynopisPreparation.FileHandling;


import java.io.*;
public class CopyFilee {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("source.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("target.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}



/* how to remove spefic line from a file
BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
List<String> lines = new ArrayList<>();
String lineToRemove = "MS Dhoni";
String line;
while ((line = reader.readLine()) != null) {
        if (!line.equals(lineToRemove)) {
        lines.add(line);
    }
            }
            reader.close();

BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
for (String l : lines) {
        writer.write(l);
    writer.newLine();
}
        writer.close();

*/





/* how to remove specific line in a file in java
BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
List<String> lines = new ArrayList<>();
String lineToRemove = "MS Dhoni";
String line;
while ((line = reader.readLine()) != null) {
    if (!line.equals(lineToRemove)) {
        lines.add(line);
    }
}
reader.close();

BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
for (String l : lines) {
    writer.write(l);
    writer.newLine();
}
writer.close();

 */





/*
 How to replace a specific word in a file with another word?
 BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
List<String> lines = new ArrayList<>();
String line;
while ((line = reader.readLine()) != null) {
    lines.add(line.replace("Kohli", "Sharma"));  // replace word
}
reader.close();

BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
for (String l : lines) {
    writer.write(l);
    writer.newLine();
}
writer.close();













. Difference between character streams and byte streams?
Feature	Character        Stream (Reader/Writer)	         Byte Stream (InputStream/OutputStream)
Data type handled     	Characters (text)	               Bytes (binary data)
Suitable for	        Text files	                       Images,audio, PDF
Classes used	        FileReader, FileWriter        	FileInputStream, FileOutputStream
 */