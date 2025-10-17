class CountandSumOddNum {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for(int i=1;i<=50;i++){
            if(i%2==1){
                count++;
                sum+=i;    
            }    
        }
        System.out.println("Count= "+ count);
        System.out.println("Sum= "+sum);
    }
}
