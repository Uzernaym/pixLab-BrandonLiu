public class GradescopeSubmission {

    private static void partOne() {
        /* Note: the images/arrays chosen are just examples, they're not necessarily the ones used in the autograder */

        /* A1, A2, and A3 are all short answer */

        /* A4 */
        IntArrayWorker worker = new IntArrayWorker();
        int[][] nums = {{1, 1, 1} ,{2,2,2}};
        worker.setMatrix(nums);
        worker.getCount(0);
        worker.getLargest();
        worker.getColTotal(0);
        IntArrayWorkerTester.testGetCount();
        IntArrayWorkerTester.testGetLargest();
        IntArrayWorkerTester.testGetColTotal();
    }

    private static void partTwo() {
        /* Note: the images chosen are just examples, they're not necessarily the ones used in the autograder */

        /* A5 */
        Picture pixA5 = new Picture("images/beach.jpg");
//        pixA5.keepOnlyBlue();
//        pixA5.negate();
//        pixA5.grayscale();
//        PictureTester.testKeepOnlyBlue();
//        PictureTester.testNegate();
//        PictureTester.testGrayscale();
//
//        pix.fixUnderwater(); // Challenge problem
//        pix.fixUnderwater(); // Challenge problem

        /* A6 */
        Picture pixA6 = new Picture("images/beach.jpg");
//        pixA6.mirrorVerticalRightToLeft();
//        pixA6.mirrorHorizontal();
//        pixA6.mirrorHorizontalBotToTop();
//        PictureTester.testMirrorVerticalRightToLeft();
//        PictureTester.testMirrorHorizontal();
//        PictureTester.testMirrorHorizontalBotToTop();

        Picture pixChallengeA6 = new Picture("images/water.jpg");
//        pixChallengeA6.mirrorDiagonal() // Challenge problem
//        PictureTester.testMirrorDiagonal() // Challenge problem

        /* A7 */
        Picture pixA7 = new Picture("images/snowman.jpg");
//        pixA7.mirrorArms();
//        pixA7.mirrorGull();
//        PictureTester.testMirrorArms();
//        PictureTester.testMirrorGull();
    }

    private static void partThree() {
        /* Note: the images chosen are just examples, they're not necessarily the ones used in the autograder */

        /* A8 */
        Picture pixA8 = new Picture("images/flower1.jpg");
//        pixA8.copy(startRow, endRow, startCol, endCol);
//        pixA8.myCollage();
//        PictureTester.testMyCollage();

        /* A9 */
        Picture pixA9 = new Picture("images/swan.jpg");
//        pixA9.edgeDetection(...) // intentionally vague about parameters, because each implementation is unique.
    }

    public static void main(String[] args) {
        GradescopeSubmission.partOne();
        GradescopeSubmission.partTwo();
        GradescopeSubmission.partThree();
    }
}
