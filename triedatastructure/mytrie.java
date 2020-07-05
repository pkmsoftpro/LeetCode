package com.gfg;

public class Trie {
  static final int alpha = 26;

  static class TrieNode {
    TrieNode[] tnode = new TrieNode[alpha];
    boolean isEOW;

    char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
        'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < alpha; i++) {
        if (this.tnode[i] != null)
          sb.append(ch[i]);
      }
      return sb.toString();
    }

    TrieNode() {
      isEOW = false;
    }
  }

  static TrieNode root = new TrieNode();

  public static void insert(String key) {
    TrieNode pCrawl = root;
    while (key.length() > 0) {
      int index = key.charAt(0) - 'a';

      if (pCrawl.tnode[index] == null) {
        pCrawl.tnode[index] = new TrieNode();
        if (key.length() == 1)
          pCrawl.tnode[index].isEOW = true; 
      }
      pCrawl = pCrawl.tnode[index];
      key = key.substring(1);
    }
  }
  
  public static boolean search(String key) {
    TrieNode pCrawl = root;
    for(int i=0; i<key.length(); i++) {
      int index = key.charAt(i) - 'a';
      if(pCrawl.tnode[index]!=null) {
        if(i==key.length()-1 && pCrawl.tnode[index].isEOW) return true;
        pCrawl = pCrawl.tnode[index];
      } else return false;
    }
    return false;
  }

  public static void main(String[] args) {

    String keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};

    for (String key : keys)
      insert(key);
    
    System.out.println(search("bt"));
  }
}
