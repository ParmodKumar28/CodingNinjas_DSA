// Code: Search word in Trie
// Send Feedback
// Implement the function Search for the Trie class.
// For a Trie, write the function for searching a word. Return true if the word
// is found successfully, otherwise return false.
// Note : main function is given for your reference which we are using
// internally to test the code.

import javax.swing.tree.TreeNode;

class TrieNode {

    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class Trie {

    private TrieNode root;
    public int count;

    public Trie() {
        root = new TrieNode('\0');
    }

    public boolean search(String word) {
        return search(root, word);
    }

    private boolean search(TrieNode root, String word) {
        // implement this function
        if (word.length() == 0) {
            return root.isTerminating;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode Child = root.children[childIndex];
        if (Child == null) {
            return false;
        }
        return search(Child, word.substring(1));
    }

    private void add(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));

    }

    public void add(String word) {
        add(root, word);
    }
}