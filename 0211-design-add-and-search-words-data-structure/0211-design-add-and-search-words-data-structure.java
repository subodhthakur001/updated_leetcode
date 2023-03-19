class WordDictionary {
    TrieNode root=null;
    private class TrieNode{
        TrieNode[] children;
        boolean isEnd;
        public TrieNode(){
            this.children=new TrieNode[26];
            this.isEnd=false;
        }
    }

    public WordDictionary() {
        this.root=new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode current=root;
        for(int i=0; i<word.length(); i++){
            char ch=word.charAt(i);
            int index=ch-'a';
            if(current.children[index]==null){
                TrieNode node=new TrieNode();
                current.children[index]=node;
                current=current.children[index];
            }else{
                current=current.children[index];
            }
        }
        current.isEnd=true;
    }
    
    public boolean search(String word) {
        return search(word, 0, root);
    }

    private boolean search(String word, int pos, TrieNode node) {
        if(node==null){
            return false;
        }

        if(pos==word.length()){
            return node.isEnd;
        }

        char ch = word.charAt(pos);

        if(ch=='.'){
            for(int i=0; i<26; i++) {
                 if(search(word, pos+1, node.children[i])) {
                     return true;
                 }
            }
            return false;
        }

        return search(word, pos+1, node.children[ch-'a']);
    }
}

   