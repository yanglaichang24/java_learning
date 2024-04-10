import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Mr.Yang
 * @desc ID
 * @date 2022/11/3 14:12
 */
public class ID {

    public static void main(String[] args) {

        System.out.println("1729971764663303".hashCode() & 31);
        System.out.println(7226945449503784993L % 128);

        System.out.println("adgroup = " + 7226945449503784993L % 8);

        System.out.println("16338635".hashCode() & 3);
        System.out.println("" + 203396758L % 4);



    }

}
