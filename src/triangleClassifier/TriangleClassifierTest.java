package triangleClassifier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
@Test
@DisplayName("Test case 2-2-2")
void testTriangleClassifier1(){
    int firstEdge = 2 ;
    int secondEdge = 2 ;
    int lastEdge = 2;
    String excepted = "Day la tam giac deu";

    String result = TriangleClassifier.triangleClassifier(firstEdge,secondEdge,lastEdge);
    assertEquals(excepted,result);
}
@Test
@DisplayName("Test case 2-2-5")
void testTriangleClassifier2(){
    int firstEdge = 3 ;
    int secondEdge = 3 ;
    int lastEdge = 5;
    String excepted = "Day la tam giac can";

    String result = TriangleClassifier.triangleClassifier(firstEdge,secondEdge,lastEdge);
    assertEquals(excepted,result);
}
@Test
@DisplayName("Test case 2-3-1")
void testTriangleClassifier3(){
    int firstEdge = 3 ;
    int secondEdge = 4 ;
    int lastEdge = 5;
    String excepted = "Day la tam giac thuong";

    String result = TriangleClassifier.triangleClassifier(firstEdge,secondEdge,lastEdge);
    assertEquals(excepted,result);
}

@Test
@DisplayName("Test case 2-3-7")
void testTriangleClassifier4(){
    int firstEdge = 2 ;
    int secondEdge = 3 ;
    int lastEdge = 7;
    String excepted = "Day khong phai tam giac";

    String result = TriangleClassifier.triangleClassifier(firstEdge,secondEdge,lastEdge);
    assertEquals(excepted,result);
}

}