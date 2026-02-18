public class Pattern {
    public static void main(String[] args) {
        char c = '*';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.println(c);
            }
            System.out.println();
        }
    }
}
