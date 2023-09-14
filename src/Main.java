import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> matlistaa = new ArrayList<String>();
        System.out.println("skriv en matlista");
        for (int i = 0; i < 10; i++) {

            String matlista = scanner.nextLine();

            matlistaa.add(matlista);

        }

        for(String matlistan : matlistaa){
            System.out.println(matlistan);
        }

        }


    }





