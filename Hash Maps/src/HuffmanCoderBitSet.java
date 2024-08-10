import java.util.BitSet;
import java.util.HashMap;

public class HuffmanCoderBitSet {
    public HashMap<Character, BitSet> encoder = new HashMap<>();
    public HashMap<BitSet,Character> decoder = new HashMap<>();

    public class Node implements Comparable<Node>{
        char data;
        int cost;
        Node left;
        Node right;

        public Node(char data,int cost){
            this.data = data;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

}
