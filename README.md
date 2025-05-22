📌 Problem Statement
This assignment involves two core tasks:
1. Build an optimized data structure** (Trie) to store words from a given file `list.txt`.
2. Perform fast dictionary search** for user-input words with a clean and interactive CLI.

✅ Features
- 📂 Loads words from `list.txt` into a memory-efficient **Trie**.
- 🔎 Searches user-input words in real-time.
- 🔁 Keeps taking inputs until the user types `exit`.
- 🧠 Efficient time and space complexity.
- 🚫 Handles all corner cases like:
  - Empty inputs
  - File not found
  - Invalid user entries

💡 Data Structure Used: Trie (Prefix Tree)
- Stores characters in a tree-like form.
- Allows O(L) insertion and search where L = length of word.
- Saves space by reusing common prefixes (e.g., "cat", "car", "can").

🧱 Folder Structure
GTROPY-Dictionary/
├── TrieNode.java // Defines each Trie node
├── DictionaryTrie.java // Trie logic: insert, search
├── DictionaryApp.java // Main runner with CLI
└── list.txt // Word list used as dictionary

📥 Input Format
- File: `list.txt`
  - Place this file in the **project root directory**.
  - Each line should contain one valid word.

🚀 How to Run
1. Clone/download the project.
2. Open in any Java IDE (IntelliJ/Eclipse).
3. Make sure `list.txt` is in the root.
4. Run `DictionaryApp.java`.

🧪 Sample CLI Output
Enter a word to search (or type 'exit' to quit): cat
✅ Word found: cat

Enter a word to search (or type 'exit' to quit): bat
❌ Word not found.

Enter a word to search (or type 'exit' to quit): exit
👋 Exiting dictionary.

🧠 Time & Space Complexity
| Operation     | Time Complexity | Space Complexity |
|---------------|------------------|------------------|
| insert(word)  | O(L)             | O(N * L)         |
| search(word)  | O(L)             | O(1)             |

> Where L = length of word, N = number of words.

👨‍💻 Developer Notes
- All class names, methods, and variables are logically named.
- File read and input edge cases are gracefully handled.
- Designed for **easy extensibility** (autocomplete, web interface, etc.).

🙌 Author
Aman – Java Developer Aspirant  
[Java | Spring Boot | DSA | Projects]

