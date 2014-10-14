
public class StringCompare{
   public static void main(String[] args){
       String word1 = "catalog";
       String word2 = "cat";
       if (word1.compareTo("aaa")>0){
           System.out.println("1 is true");
        }
       if (word1.compareTo(word2)==0){
           System.out.println("2 is true");
        }
       if (word1.compareTo(word2)<0){
           System.out.println("3 is true");
        }
       if (word1.substring(0,3).equals(word2.substring(0,3))){
           System.out.println("4 is true");
        }
    }
}
