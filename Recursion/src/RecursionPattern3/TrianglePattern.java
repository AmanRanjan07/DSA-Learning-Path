package RecursionPattern3;

public class TrianglePattern {
    public static void main(String[] args) {
    Fliptriangle(4,0);
    simpleTriangle(4,0);
    }
    static void Fliptriangle(int r,int c){
        if(r == 0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            Fliptriangle(r,c+1);
        }
        else{
            System.out.println("  ");
            Fliptriangle(r-1,0);
        }
    }

    static void simpleTriangle(int r,int c){
        if(r == 0){
            return;
        }
        if(c < r){
            simpleTriangle(r,c+1);
            System.out.print("* ");
        }
        else{
            simpleTriangle(r-1,0);
            System.out.println();
        }
    }
}
