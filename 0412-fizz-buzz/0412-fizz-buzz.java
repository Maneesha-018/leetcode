class Solution {
    public List<String> fizzBuzz(int n) {
        String [] arr = new String[n];
        int in=0;
        for(int i=1;i<=n;i++){
            arr[in]=String.valueOf(i);
            if(i%3==0){
               arr[in]="Fizz" ;
            }
            if(i%5==0){
                arr[in]="Buzz";
            }
            if(i%3==0 && i%5==0){
                arr[in]="FizzBuzz";
            }
            in++;
        }
        return Arrays.asList(arr);
    }
}