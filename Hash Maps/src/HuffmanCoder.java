import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SimpleTimeZone;


public class HuffmanCoder{
    
    //Two hashmaps to represent two tables:Encoder and decoder.
    
    HashMap<Character,String> encoder;
    HashMap<String,Character> decoder;
    
    //A min heap of nodes that will help to get the smallest node values.
    
    public class Node implements Comparable<Node>{
        
        char data;
        int cost; // Frequency
        Node left;
        Node right;
        
        public Node(char data,int cost){
            this.data = data;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }
    
    // A frequency map that will store the frequency of each character.
    
    public HuffmanCoder(String feeder) throws Exception {
        HashMap<Character, Integer> fmap = new HashMap<>();
        for (int i = 0; i < feeder.length(); i++) {
            fmap.put(feeder.charAt(i), fmap.getOrDefault(feeder.charAt(i), 0) + 1);
        }

        //The min heap will store all the created nodes.

        MinHeap<Node> minHeap = new MinHeap<>();
        Set<Map.Entry<Character, Integer>> nodeEntry = fmap.entrySet();
        for (Map.Entry<Character, Integer> entry : nodeEntry) {
            Node node = new Node(entry.getKey(), entry.getValue());
            node.left = null;
            node.right = null;
            minHeap.insert(node);
        }

        //Now take 2 nodes every time and combine them until only 1 node is left.

        while (minHeap.size() != 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node combined = new Node('\0', first.cost + second.cost);
            combined.left = first;
            combined.right = second;
            minHeap.insert(combined);
        }

        //A new tree will be created that will be structured in such a way that it can create a unique code for each character.

        Node ft = minHeap.remove();
        encoder = new HashMap<>();
        decoder = new HashMap<>();

        this.encoderdecoder(ft, "");

    }

    private void encoderdecoder(Node node,String code){
        if (node == null){
            return;
        }

        if (node.left == null && node.right == null){
            this.encoder.put(node.data,code);
            this.decoder.put(code,node.data);
        }

        encoderdecoder(node.left,code + '0');
        encoderdecoder(node.right,code + '1');
    }

    // encode() returns the coded string.

    public String encode(String rawString){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < rawString.length(); i++) {
            ans.append(encoder.get(rawString.charAt(i)));
        }
        return ans.toString();
    }

    //decode() returns the coded string into its normal form.

    public String decode(String codedString){
        String key = "";
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < codedString.length(); i++) {
            key += codedString.charAt(i);
            if (decoder.containsKey(key)){
                ans.append(decoder.get(key));
                key = "";
            }
        }
        return ans.toString();
    }
    
}
