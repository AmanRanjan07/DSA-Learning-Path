public class PerformanceString {
    public static void main(String[] args) {
        String series = "";
        for(int i=0;i<26;i++){
             int cha = 'A'+i;
             char ch = (char)('A'+i);// it will print the value form the a to z character
//            System.out.println(ch);
            series = series+ch;
            System.out.println(cha);// not a good solution. here because of the n times of the iteration..
        }
        System.out.println(series+" ");
    }
}
