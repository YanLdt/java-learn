import java.util.Scanner;

/**
 * @Author: YanL
 * @Time: 16:13 2019/11/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class ScannerDelimiter {
    public static void main(String[] args){
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNext())
            System.out.println(scanner.next());
    }
}
