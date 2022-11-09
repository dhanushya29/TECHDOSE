public class carFleet {
    class Solution {
        public int carFleet(int target, int[] position, int[] speed) {
               int res = 0;
               float[] timeArr = new float[target];
               for (int i = 0; i < position.length; i++)
                {
                    timeArr[position[i]]= (float)(target - position[i]) / speed[i];
                }
                float prev = 0;
                for (int i = target-1; i >=0 ; i--)
                {
                    float cur = timeArr[i];
                    if (cur > prev)
                    {
                        prev = cur;
                        res++;
                    }
                }
                return res;
        }
    }
}
