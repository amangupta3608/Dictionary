import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
    Perform search in the build dictionary from list.txt
    Loading word from file
    Accepting user input
    Searching using the optimized Trie structure
*/
public class DictionaryApp {
    public static void main(String[] args) throws IOException {
        DictionaryTrie trie = new DictionaryTrie(); //Logical class and variable names
        Scanner scanner = new Scanner(System.in);

        //Load word from list.txt file
        try {
            BufferedReader br = new BufferedReader(new FileReader("list.txt"));
            String line;
            while((line = br.readLine()) != null){
                trie.insert(line.trim().toLowerCase()); //handles edge case: whitespace and casing
            }
            br.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Error: list.txt not found. PLease make sure it's in the root folder");
            return;
        }catch (IOException e){
            System.out.println("Error Reading 'list.txt'.");
            return;
        }


        //Accepting user input
        while(true){
            System.out.print("\nEnter a word to search (or type '0' to quit): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if(input.equals("0")){
                System.out.println("Exiting dictionary search.");
                break;
            }

            //Edge case: Check if input is empty
            if(input.isEmpty()){
                System.out.print("Input cannot be Empty!");
                continue;
            }

            //Perform Search
            if(trie.search(input)){
                System.out.println("Word found in Dictionary: " + input);
            }else{
                System.out.println("Word not found in Dictionary");
            }
        }
        scanner.close();
    }
}
