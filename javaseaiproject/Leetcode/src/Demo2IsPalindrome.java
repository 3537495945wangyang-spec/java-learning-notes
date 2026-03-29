public class Demo2IsPalindrome {
    public static void main(String[] args) {
        boolean result = isPalindromeLeftRight(12321);
        System.out.println(result);

    }
    public static boolean isPalindrome(int x) {
        if(x<0 ){
            return false;
        } else if (0<=x && x<10) {
            return true;
        } else {
           String s = String.valueOf(x);
           String s1 = "";
            for (int i = 0; i <s.length() ; i++) {
                String part = String.valueOf(s.charAt(i));
                    s1 =part + s1 ;
            }
            System.out.println(s1);

            if (s1.equals(s)){
                return true;
            }else  {
                return false;
            }
        }
    }


    public static boolean isPalindromePro(int x) {

        if(x<0||(x%10==0 && x!=0)) return false;
        int rev=0;
        while(x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
      return rev == x || x == rev/10;

    }
    public static boolean isPalindromeBuilder(int x) {

      String s = Integer.toString(x);
      String rs = new StringBuilder(s).reverse().toString();
      return s.equals(rs);
    }

    public static boolean isPalindromeLeftRight(int x) {
        String s = String.valueOf(x);
        int left =0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }return true;
    }
}
