import java.util.HashMap;
import java.util.Map;

//This class defines the node of the trie structure
public class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>(); //Maps Characters to child TrieNodes
    boolean isEndOfWord = false; //Marks the end of a valid word
}
