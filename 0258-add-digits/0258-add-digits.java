class Solution {
    public int addDigits(int num) {
        int d;
        int sum=0;
        while(num>0){
            while(num>0){
                d=num%10;
                sum+=d;
                num=num/10;
            }
            if(sum<10){
                return sum;
            }
            num=sum;
            sum=0;
        }
        return sum;
    }
}