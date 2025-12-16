public class Print1to100NoLoop {
    static void print(int n){
        if(n>100){
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

    public static void main(String[] args) {
        print(1);
    }
}
