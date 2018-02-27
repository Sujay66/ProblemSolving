package DataStructures;

public class Tries {
    private TrieNode root;
    public Tries(){
        root = new TrieNode();
    }

    public void insertWord(String s){
        TrieNode current = root;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            TrieNode node = current.getTrieNode().get(ch);
            if(node == null){
                node = new TrieNode();
                current.getTrieNode().put(ch,node);
            }
            current = node;
        }
        current.setEndOfWord(true);
    }

    public boolean search(String s) {
        TrieNode current = root;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            TrieNode node = current.getTrieNode().get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.isEndOfWord();
    }


    private boolean delete(TrieNode current, String s, int index) {
        if (index == s.length()) {
            //when end of word is reached only delete if currrent.endOfWord is true.
            if (!current.isEndOfWord()) {
                return false;
            }
            current.setEndOfWord(false);
            //if current has no other mapping then return true
            return current.getTrieNode().size() == 0;
        }
        char ch = s.charAt(index);
        TrieNode node = current.getTrieNode().get(ch);
        if (node == null) {
            return false;
        }
        boolean shouldDeleteCurrentNode = delete(node, s, index + 1);

        //if true is returned then delete the mapping of character and trienode reference from map.
        if (shouldDeleteCurrentNode) {
            current.getTrieNode().remove(ch);
            //return true if no mappings are left in the map.
            return current.getTrieNode().size() == 0;
        }
        return false;
    }
}
