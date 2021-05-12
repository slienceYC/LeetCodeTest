package algorithm;

/**
 * @author fyc
 * @date 2021-5-12
 * 整数翻转
 */
public class Reverse {

    public static int function(int x) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean isNegative = false;

        if (x < 0) {
            isNegative = true;
            x = -x;
        }

        String str = String.valueOf(x);
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuffer.append(str.charAt(i));
        }

        try {
            Integer result = Integer.valueOf(stringBuffer.toString());
            if (isNegative) {
                result = -result;
            }
            return result;
        }catch (Exception e){
            return 0;
        }
    }

    public static int delivery(int x){
        int result = 0;
        int digit = 0;
        while (x != 0) {
            // 超出Integer的最大最小值范围了
            if (result < Integer.MIN_VALUE/10 || result > Integer.MAX_VALUE/10) {
                return 0;
            }
            digit = x % 10;
            x /= 10;
            result = result*10 + digit;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(delivery(9646324));
    }
}
