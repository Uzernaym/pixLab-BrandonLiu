/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    //beach.explore(); // comment these out in repl.it
    beach.zeroBlue();
    beach.explore(); // comment these out in repl.it

    // uncomment this in repl.it to test your code!!
    // beach.write("imagesOutput/beach.jpg");
  }

  public static void testKeepOnlyBlue() {
      Picture beach = new Picture("images/beach.jpg");
      beach.keepOnlyBlue();
      beach.explore();
  }
  public static void testKeepOnlyRed() {
      Picture beach = new Picture("images/beach.jpg");
      beach.keepOnlyBlue();
      beach.explore();
  }
  public static void testKeepOnlyGreen() {
      Picture beach = new Picture("images/beach.jpg");
      beach.keepOnlyBlue();
      beach.explore();
  }
  public static void testNegate() {
      Picture beach = new Picture("images/beach.jpg");
      beach.negate();
      beach.explore();
  }

    public static void testGrayscale() {
        Picture beach = new Picture("images/beach.jpg");
        beach.grayscale();
        beach.explore();
    }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

    public static void testMirrorVerticalRightToLeft()
    {
        Picture caterpillar = new Picture("images/caterpillar.jpg");
        caterpillar.mirrorVerticalRightToLeft();
        caterpillar.explore();
    }

    public static void testMirrorHorizontal()
    {
        Picture caterpillar = new Picture("images/caterpillar.jpg");
        caterpillar.mirrorHorizontal();
        caterpillar.explore();
    }

    public static void testMirrorHorizontalBotToTop()
    {
        Picture caterpillar = new Picture("images/caterpillar.jpg");
        caterpillar.mirrorHorizontalBotToTop();
        caterpillar.explore();
    }

    public static void testMirrorDiagonal()
    {
        Picture caterpillar = new Picture("images/beach.jpg");
        caterpillar.mirrorDiagonal();
        caterpillar.explore();
    }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images/temple.jpg");
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms()
  {
      Picture snowman = new Picture("images/snowman.jpg");
      snowman.mirrorArms();
      snowman.explore();
  }

  public static void testMirrorGull()
  {
      Picture seagull = new Picture("images/seagull.jpg");
      seagull.mirrorGull();
      seagull.explore();
  }


  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
      //testMirrorVerticalRightToLeft();
      //testMirrorHorizontal();
      //testMirrorHorizontalBotToTop();
      //testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    testMirrorGull();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}