public class practice9 {
    
    public boolean isPalindrome(int n){
        int r , rev=0, orig=n;
        if(n<0){
            return false;
        }

        while(n!=0){
            r = n%10;
            rev=rev*10+r;
            n=n/10;

        }

        return orig==rev;

    }
    
}
