import java.util.Arrays;

public class Trapping_Rainwater {
  public static int  TrappedRainwater(int arr[]) {
    //cal left max boundary 
    int lmb[] = new int[arr.length];
    lmb[0] = arr[0];
    for(int i=1;i<arr.length;i++){
      lmb[i] = Math.max(arr[i],lmb[i-1]);
    }

    //cal right max boundary
    int rmb[] = new int[arr.length];
    rmb[arr.length-1]= arr[arr.length-1];
    for(int i=arr.length-2;i>=0;i--){
      rmb[i] = Math.max(arr[i], rmb[i+1]);
    }

    int trapWater=0;
    //loop
    for(int i=0;i<arr.length;i++){
      //waterLevel = min(leftmax boound, rightmax bound)
      int waterLevel = Math.min(lmb[i],rmb[i]);
      //trapwater = waterlevel - arr[i]
      trapWater += waterLevel - arr[i];
    }
    return trapWater;
  }
  public static void main(String[] args) {
    int arr[] = {4,2,0,6,3,2,5};
    System.out.println("Height: " + Arrays.toString(arr));
    int ans = TrappedRainwater(arr);
    System.out.println("Total Trapped Water:" + ans);
  }
}
