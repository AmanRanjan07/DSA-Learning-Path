package RecursionLevel1;

public class PrintReverseWay {
    public static void main(String[] args) {
            int n = 5;
            printInDESC(n);
        System.out.println("IN THE ASCENDING FORMATE ..");
        printInASCE(n);
    }



    static void printInDESC(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printInDESC(n-1);
    }

    static void printInASCE(int n){
        if(n==0){
            return;
        }
        printInASCE(n-1);

        System.out.println(n);
    }
}
