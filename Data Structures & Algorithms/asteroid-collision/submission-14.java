class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a : asteroids){
            while(!stack.isEmpty() && a < 0 && stack.peek() > 0){
                int diff = a + stack.peek();
                if(diff < 0){
                    stack.pop();
                }
                else if(diff > 0){
                    a = 0;
                }
                else{
                    a = 0;
                    stack.pop();
                }
            }
            if(a != 0){
                stack.add(a);
            }
        }
        Integer[] boxed = stack.toArray(new Integer[0]);
        int[] res = new int[boxed.length];
        for (int i = 0; i < boxed.length; i++) {
            res[i] = boxed[i];
        }
        return res;

    }
}