public class WhileCount {
    public static void main(String[] args) {
        int count=0,i=1;
        int sum=0;
        while(i<=50){
            if(i%2==1){
                count++;
                sum+=i;
            }
            i++;
        }
        System.out.println("Count= "+ count);
        System.out.println("Sum= "+sum);
    }
}
