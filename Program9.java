public class Program9 {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++)
            System.out.print("*");
        System.out.println();
        for(int i=0;i<n-2;i++){
            System.out.print("*");
            for(int j=0;j<n-i-3;j++)
                System.out.print(" ");
            System.out.println("*");
        }
        System.out.println("*");
    }
}
