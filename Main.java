import java.util.*;

public class Main{
    public static void main(String[] args){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("9以下の整数を入力してください");
        int N = sc.nextInt();
        int[] nums=new int[N];
        int cnt=0;
        while(cnt<N){
            int test=rd.nextInt(9)+1;
            int flag=0;
            for(int j=0;j<N;j++){
                if(test==nums[j]){
                    flag=1;
                }
            }
            if(flag==0){
                nums[cnt]=test;
                cnt+=1;
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
