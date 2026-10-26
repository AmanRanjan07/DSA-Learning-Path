package DsaInJava.Searching_Algorithms.LinearSearching;
//
//public class SearchingINstring {
//    public static void main(String[] args) {
//        String name = "Ranjan";
//        char target = 'j';
//        System.out.println(Search(name,target));
//    }
//    static boolean Search(String str, char target){
//        if(str.length() == 0){
//            return false;
//        }
//        for(int i=0;i<str.length();i++){
//            if(target == str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }
//}

 public class SearchingINstring{
     public static void main(String[] args) {
         String name = "Ankit Ranjan";
         char targe = 'z';
         System.out.println(Search(name,targe));
     }
     static boolean Search (String str, char target) {
         if (str.length() == 0) {
             return false;
         }
         for (int i = 0; i < str.length(); i++) {
             if (target == str.charAt(i)) {
                 return true;
             }
         }
         return false;
     }
}