package Ch_2_2_Mergesort;

public class Practise_2_2_05 {
    public static void main(String[] args) {
        /*
         * N = 39
         * 
         * 自顶向下 : 假设要归并两个大小分别为 3 2 的数组，写作 m32
         * 
         * sort(0, 39) -> sort(0, 19) -> sort(0, 9) -> sort(0, 4) -> sort(0, 2) -> sort(0, 1) 
         * 
         * -> m11 -> m21 -> sort(3, 4) -> m11 -> m32 -> sort(5, 9) -> sort(5, 7) -> sort(5, 6)
         * 
         * -> m11 -> m21 -> sort(8, 9) -> m11 -> m32 -> m55 -> sort(10, 19) -> sort(10, 14) ->
         * 
         * -> sort(10, 12) -> sort(10, 11) -> m11 -> m21 -> sort(13, 14) -> m11 -> sort(15, 19)
         * 
         * -> sort(15, 17) -> sort(15, 16) -> m11 -> m21 -> sort(18, 19) -> m11 -> m32 -> m55 ->m1010
         * 
         * -> sort(20, 39) -> sort(20, 29) -> sort(20, 24) -> sort(20, 22) -> sort(20, 21) ->
         * 
         * m11 -> m21 -> sort(23, 24) -> m11 -> m32 -> sort(25, 29) -> sort(25, 27) -> sort(25, 26) ->
         * 
         * -> m11 -> m21 -> sort(28, 29) -> m11 -> m32 -> m55 -> sort(30, 39) -> sort(30, 34) -> 
         * 
         * -> sort(30, 32) -> sort(30, 31) -> m11 -> m21 -> sort(33, 34) -> m11 -> m32 -> sort(35, 39)
         * 
         * -> sort(35, 37) -> sort(35, 36) -> m11 -> m21 -> sort(38, 39) -> m11 -> m32 -> m55 -> m1010
         * 
         * ->  m2020
         * 
         * 自下向顶 : 
         * 
         * merge(0, 0, 1) -> m11 -> merge(2, 2, 3) -> m11 -> merge(4, 4, 5) -> m11 -> merge(6, 6, 7) -> m11 ->  
         * 
         * merge(8, 8, 9) -> m11 -> merge(10, 10, 11) -> m11 -> merge(12, 12, 13) -> m11 -> merge(14, 14, 15) -> m11 -> 
         * 
         * merge(16, 16, 17) -> m11 -> merge(18, 18, 19) -> m11 -> merge(20, 20, 21) -> m11 -> merge(22, 22, 23) -> m11 -> 
         * 
         * merge(24, 24, 25) -> m11 -> merge(26, 26, 27) -> m11 -> merge(28, 28, 29) -> m11 -> merge(30, 30, 31) -> m11 -> 
         * 
         * merge(32, 32, 33) -> m11 -> merge(34, 34, 35) -> m11 -> merge(36, 36, 37) -> m11 -> merge(38, 38, 39) -> m11 -> 
         *  
         * merge(0, 1, 3) -> m22 -> merge(4, 5, 7) -> m22 -> merge(8, 9, 11) -> m22 -> merge(12, 13, 15) -> m22 -> merge(16, 17, 19)          )
         * 
         * -> m22 -> merge(20, 21, 23) -> m22 -> merge(24, 25, 27) -> m22 -> merge(28, 29, 31) -> m22 -> merge(32, 33, 35) -> m22 ->  
         * 
         * -> m22 -> merge(36, 37, 39) -> m22 
         * 
         * merge(0, 3, 7) -> m44 -> merge(8, 11, 15) -> m44 -> merge(16, 19, 23) -> m44 -> merge(24, 27, 31) -> m44 -> merge(32, 35, 39) ->m44 ->      
         * 
         * merge(0, 7, 15) -> m88 -> merge(16, 23, 31) ->  m88 -> merge(32, 39, 39) ->  m81 
         * 
         * merge(0, 15, 31) -> m1616 -> merge(32, 39, 39) -> m81
         * 
         * merge(0, 31, 39) -> m328
         */
    }
}
