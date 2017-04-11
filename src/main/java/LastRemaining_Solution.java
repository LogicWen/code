/**
 * Created by andy on 17-4-11.
 */

//约瑟夫环问题：n个节点的环中，每遇到m个节点就删掉一个节点，求最后留下来的节点

public class LastRemaining_Solution {

    public static void main(String[] args) {
        System.out.print(LastRemaining_Solution(5, 3));
    }

    public static int LastRemaining_Solution(int n, int m) {
        if(n<1||m<1) {
            return -1;
        }
        int last = 0;
        for(int i = 2;i<=n;i++) {
            last = (last + m) % i;
        }
        return last;
    }
}
