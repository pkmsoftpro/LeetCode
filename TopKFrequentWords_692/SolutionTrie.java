/*
** https://leetcode.com/problems/top-k-frequent-words/discuss/108399/Java-O(n)-solution-using-HashMap-BucketSort-and-Trie-22ms-Beat-81
*/
public List<String> topKFrequent(String[] words, int k) {
        // calculate frequency of each word
        Map<String, Integer> freqMap = new HashMap<>();
        for(String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        // build the buckets
        TrieNode[] count = new TrieNode[words.length + 1];
        for(String word : freqMap.keySet()) {
            int freq = freqMap.get(word);
            if(count[freq] == null) {
                count[freq] = new TrieNode();
            }
            addWord(count[freq], word);
        }
        // get k frequent words
        List<String> list = new LinkedList<>();
        for(int f = count.length - 1; f >= 1 && list.size() < k; f--) {
            if(count[f] == null) continue;
            getWords(count[f], list, k);
        }
        return list;
    }
    
    private void getWords(TrieNode node, List<String> list, int k) {
        if(node == null) return;
        if(node.word != null) {
            list.add(node.word);
        }
        if(list.size() == k) return;
        for(int i = 0; i < 26; i++) {
            if(node.next[i] != null) {
                getWords(node.next[i], list, k);
            }
        }
    }
    
    private boolean addWord(TrieNode root, String word) {
        TrieNode curr = root;
        for(char c : word.toCharArray()) {
            if(curr.next[c - 'a'] == null) {
                curr.next[c - 'a'] = new TrieNode();
            }
            curr = curr.next[c - 'a'];
        }
        curr.word = word;
        return true;
    }
    
    class TrieNode {
        TrieNode[] next;
        String word;
        TrieNode() {
            this.next = new TrieNode[26];
            this.word = null;
        }
    }
