class Solution {
    public int subtractProductAndSum(int n) {
        int digit;
        int product=1;
        int sum=0;
        int count=1;
        while(n>0){
            digit=n%10;
            product = count*digit;
            count=product;
            sum = sum+digit;
            n=n/10;
        }
        int result = product-sum;
        return result;
        
    }
}