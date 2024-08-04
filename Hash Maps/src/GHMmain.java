public class GHMmain {
    public static void main(String[] args) {
        GenericHashMap<String,String> map = new GenericHashMap<>();
        map.put("CSE","Coder");
        map.put("CE","Labour");
        map.put("ME","Mechanic");
        map.put("Pharm","Pharmacist");

        System.out.println(map.toString());

        map.remove("CE");
        System.out.println(map.toString());
        System.out.println(map.containsKey("ME"));
        System.out.println(map.containsKey("CE"));
        System.out.println(map.get("CSE"));
    }
}
