import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HillelFileWriter hillelFileWriter = new HillelFileWriter();
        Scanner scanner = new Scanner(System.in);
        String fName = args[0];
        String fText = args[1];
        //String fileName = "New file";
        //String content = "Text..text";

       /* System.out.println("Please, enter a file name:");
        String fName = scanner.nextLine();
        System.out.println("Please, enter a text:");
        String fText = scanner.nextLine();
       */
        hillelFileWriter.writeToFile(fName, fText);
    }
}
