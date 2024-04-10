/**
 *
 * <p>
 *     迭代中
 *     重试机制导致死循环
 *
 *     场景
 *      i=105 OK
 *      i=106 throw Exception retry
 *      可能导致死循环
 * </p>
 *
 * @author Mr.Yang
 * @desc Call
 * @date 2022/12/9 20:04
 */
public class Call {


    public static void call(int retry,int i) {
        try {
            if(i == 105) {
                call(retry, 106);
            } else {
                throw new RuntimeException();
            }

        } catch (Exception e) {
            if (retry <= 3) {
                call(++retry,i);
            }
            throw e;
        }
    }


    public static void main(String[] args) {
        call(0,105);
    }






}
