package 第二章_归并排序;

public class Practise_2_2_04 {
    public static void main(String[] args) {
        /*
         * 原地归并的抽象方法是一种互相让步的策略
         * 
         * A : 我现在栈顶元素是 3，你的是几？？如果比我小就 pop，否则把机会让给我
         * B : 我现在栈顶元素是 5, 你的是几？？如果比我小就 pop, 否则把机会让给我
         * 
         * 两个人互相谦让，所以 pop 的元素会从最小的开始，当然，这要求两个人的栈中元素都是已经按升序排列的
         * 
         * 所以当且仅当两个输入的子数组都有序时，这种策略才能得到正确的结果
         */
    }
}
