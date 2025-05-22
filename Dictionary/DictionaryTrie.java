public class DictionaryTrie {
    private TrieNode root;

    public DictionaryTrie(){
        root = new TrieNode();
    }

    /*
    Insert the word into the Trie
    Time Complexity: O(L) where L = Length of the word
    Space Complexity: O(N*L) in worst-case where N = number of words (if no shared prefix)
     */
    public void insert(String word){
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            node = node.children.computeIfAbsent(ch, c-> new TrieNode());
        }
        node.isEndOfWord = true;
    }

    /*
    Search word in the Trie
    Time Complexity: O(L)
    Space Complexity: O(1)
    Highly optimized word lookup using prefix traversal (no full-word scanning required)
    Corner case handled: return false if any character is missing during traversal
     */
    public boolean search(String word){
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            if(!node.children.containsKey(ch)){
                return false; //Edge Case: character path breaks
            }
            node = node.children.get(ch);
        }
        return node.isEndOfWord; //True only if the word exists and complete
    }
}
