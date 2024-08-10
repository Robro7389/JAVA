public class HCmain {
    public static void main(String[] args) throws Exception {
        String str = "Cheen tapak dam dam";
        HuffmanCoder HC = new HuffmanCoder(str);
        String cs = HC.encode(str);
        System.out.println(cs);
        String ds = HC.decode(cs);
        System.out.println(ds);
        System.out.println(HC.encoder);
    }
}
