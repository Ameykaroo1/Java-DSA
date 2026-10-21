//Given a route containing 4 direction (E,w,N,S), find the shortest path to reach destination.
package String;
public class Shortest_path {
  public static float getShortestPath(String path){
    int x=0,y=0, n=path.length();
    for(int i=0; i<n; i++){
      if(path.charAt(i) == 'W'){
        x--;
      }
      else if(path.charAt(i) == 'E'){
        x++;
      }
      else if(path.charAt(i) == 'S'){
        y--;
      }
      else if(path.charAt(i) == 'N'){
        y++;
      }
    }
    int X2 = x*x;
    int Y2 = y*y;
    return (float)Math.sqrt(X2 + Y2);
  }
  public static void main(String[] args) {
    String path = "WNEENESENNN";
    System.out.println(getShortestPath(path));
  }
}
