public class Program8 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            System.out.print("*");
            for(int j=1;j<=n-2;j++)
                System.out.print(" ");
            System.out.println("*");
        }
    }
}
