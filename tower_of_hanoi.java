


// done via recursion

public class tower_of_hanoi {


    public static void toh(int n, String src, String help, String dest) {
        if(n==1){
            System.out.println(" transfer disc " + n + " from " + src + " to " + dest);
            return;
        }
        toh(n-1, src, help, dest);
        System.out.println(" transfer disc " + n + " from " + src + " to " + dest);
        toh(n-1, help,src, dest);
        
    }
    public static void main(String[] args) {
        int n=3;
        toh(n,"S","H","D" );        
    }
    
}
