package DataStructures;

import java.util.HashMap;

public class TrieNode {
    private HashMap<Character,TrieNode> trieNode;
    private boolean endOfWord;

    public TrieNode(){
        trieNode = new HashMap<>();
        endOfWord = false;
    }

    public HashMap<Character, TrieNode> getTrieNode() {
        return trieNode;
    }

    public void setTrieNode(HashMap<Character, TrieNode> trieNode) {
        this.trieNode = trieNode;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }
    public boolean isEndOfWord() {
        return endOfWord;
    }

}
