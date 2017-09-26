package asst_04;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;

// path to example java file C:\\Users\\David\\IdeaProjects\\assignment_01\\src\\upperCaseArray.java

public class count_Keywords {

    public static void main(String[] args) throws FileNotFoundException {

        int keyword_tally = 0; // keyword counter
        TreeSet<String> setter = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in the path to the Java file: ");
        String file_path = scanner.next();
        //System.out.println(file_path);

		/*try(BufferedReader readthis = new BufferedReader(new FileReader(file_path))){
			String aLine;

			while((aLine = readthis.readLine()) != null){
				System.out.println(aLine);
			}*/
        try (Scanner input = new Scanner(new File("C:\\Users\\David\\Desktop\\keywords"));) {
            while (input.hasNext())
                setter.add(input.next().toLowerCase());
        }
        try (Scanner input = new Scanner(new File(file_path));){
            while (input.hasNext()) {
                String[] terms = input.nextLine().split(" ");
                for(int i = 0;i<terms.length;i++){
                    if(terms[i].contains("//")){
                        break;
                    }
                    if (setter.contains(terms[i].trim().toLowerCase())){
                        System.out.println("keyword: " + terms[i].trim());
                        keyword_tally++;
                    }
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("The total number of keywords found in the Java file is: " + keyword_tally);
    }
}