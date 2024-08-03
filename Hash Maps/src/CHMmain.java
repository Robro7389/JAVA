public class CHMmain {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put("CSE","Coder");
        map.put("CE","Labour");
        map.put("ME","Mechanic");

        System.out.println(map.get("CSE"));
        System.out.println(map.getOrDefault("MEE","BBA kar raha hoga"));
    }
}
