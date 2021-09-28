package triangleClassifier;

import java.util.Scanner;

public class TriangleClassifier {
    public static String triangleClassifier(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            if ((a == b) || (b == c) || (c == a)) {
                if ((a == b) && (b == c)) {
                    return "Day la tam giac deu";
                } else {
                    return "Day la tam giac can";
                }

            }
            return "Day la tam giac thuong";
        } else {
            return "Day khong phai tam giac";
        }

    }
}
