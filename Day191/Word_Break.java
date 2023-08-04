package Day191;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Word_Break {
    class Solution {

        public class TrieNode {
            public char data;
            public TrieNode[] children;
            public boolean isEndingChar;

            public TrieNode(char data) {
                this.data = data;
                children = new TrieNode[26];
                isEndingChar = false;
            }
        }

        class Trie {
            private TrieNode root;

            public Trie() {
                root = new TrieNode('/');
            }

            public TrieNode getRootNode() {
                return root;
            }

            public void insert(String word) {
                char[] text = word.toCharArray();
                TrieNode p = root;
                for (int i = 0; i < text.length; ++i) {
                    int index = text[i] - 'a';
                    if (p.children[index] == null) {
                        TrieNode newNode = new TrieNode(text[i]);
                        p.children[index] = newNode;
                    }
                    p = p.children[index];
                }
                p.isEndingChar = true;
            }
        }

        public boolean wordBreak(String s, List<String> wordDict) {
            Trie trie = new Trie();

            for (String str : wordDict) {
                trie.insert(str);
            }

            TrieNode root = trie.getRootNode();
            Map<Integer, Boolean> memo = new HashMap<>();

            wordBreakDetail(s.toCharArray(), memo, 0, root);

            return memo.get(0);
        }

        private boolean wordBreakDetail(char [] chs, Map<Integer, Boolean> memo, int startIdx, TrieNode root) {
            if (startIdx == chs.length) {
                return true;
            }

            if (memo.containsKey(startIdx)) {
                return memo.get(startIdx);
            }


            TrieNode currNode = root;
            boolean resultFound = false;

            for (int i = startIdx; i < chs.length; i++) {
                char c = chs[i];

                currNode = currNode.children[c - 'a'];

                if (currNode == null) {
                    break;
                }

                if (currNode.isEndingChar) {
                    resultFound = wordBreakDetail(chs, memo, i+1, root);
                }

                if (resultFound) {
                    break;
                }
            }

            memo.put(startIdx, resultFound);

            return memo.get(startIdx);
        }
    }
}
