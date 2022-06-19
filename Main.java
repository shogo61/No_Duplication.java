import java.util.*;

public class Main{
    public static void main(String[] args){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        
        // Nに1~9の整数が格納されるまで繰り返す
        System.out.println("1~9の整数を入力してください");
        int N = sc.nextInt();
        while(true){
            if(0<N && N<10){
                break;
            }
            System.out.println("1~9の整数を入力してください");
            N = sc.nextInt();
        }
        
        int[] nums=new int[N];
        int cnt=0;
        while(cnt<N){
            // 一度testに乱数を生成
            int test=rd.nextInt(9)+1;
            int flag=0;
            
            // nums内にtestが格納されているか調べる
            for(int j=0;j<N;j++){
                if(test==nums[j]){
                    flag=1;
                }
            }
            // 格納されていなければnumsに格納して次のインデックスに移動
            if(flag==0){
                nums[cnt]=test;
                cnt+=1;
            }
        }
        
        // 答えの表示
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
