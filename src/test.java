public class test {
    public static void main(String[] args) {
        String response = unSandwich("breaddogbread");
        System.out.println(response);
    }
    public static String unSandwich(String testString){
        // return blank if there aren't two "bread"s
        int firstBread = testString.indexOf("bread");
        int lastBread = testString.lastIndexOf("bread");
        if(firstBread == lastBread) return "";
        
        // return the substring between the breads
        String middle = testString.substring(firstBread + "bread".length(), lastBread);
        return middle;
    }
}
