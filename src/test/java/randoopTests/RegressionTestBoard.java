package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestBoard {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.UP;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.UP));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell4 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 10, (int) (byte) 10, cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        ar.edu.unrc.game2048.Cell cell6 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 0, (int) (short) 10, cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.Class<?> wildcardClass7 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean15 = board11.equals((java.lang.Object) '4');
        ar.edu.unrc.game2048.Cell cell18 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) '#', (int) (byte) 0, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Cell cell16 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) 'a', 10, cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        java.lang.String str4 = board0.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board0.getCell((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Cell cell8 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 1, 2048, cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.isLosingBoard();
        boolean boolean8 = board6.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean14 = board11.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass15 = board11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.String str1 = board0.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board0.getCell(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str1, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board11.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean15 = board11.equals((java.lang.Object) '4');
        boolean boolean16 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell19 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) (short) 1, 2048, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.repOK();
        boolean boolean4 = board0.repOK();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean14 = board11.equals((java.lang.Object) 10.0d);
        boolean boolean15 = board11.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell18 = board11.getCell((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Cell cell6 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((-1), (int) (short) -1, cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.isLosingBoard();
        boolean boolean8 = board6.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean14 = board11.equals((java.lang.Object) 10.0d);
        boolean boolean15 = board11.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        int int7 = board0.getScore();
        ar.edu.unrc.game2048.Cell cell10 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(10, (int) (short) 100, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.String str4 = board3.toString();
        boolean boolean5 = position2.equals((java.lang.Object) board3);
        boolean boolean6 = board3.isLosingBoard();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 0);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 0)" + "'", str3, "(100, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 0)" + "'", str5, "(100, 0)");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean15 = board11.equals((java.lang.Object) '4');
        ar.edu.unrc.game2048.Cell cell18 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) (short) 1, 4, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        java.lang.Class<?> wildcardClass1 = direction0.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean15 = board11.equals((java.lang.Object) '4');
        ar.edu.unrc.game2048.Cell cell18 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) (short) 0, (int) (short) 0, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        int int5 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.moveRight();
        boolean boolean8 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.repOK();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        boolean boolean8 = position2.equals((java.lang.Object) 4);
        int int9 = position2.col;
        java.lang.String str10 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(4, 0)" + "'", str10, "(4, 0)");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        int int2 = board0.getSize();
        boolean boolean3 = board0.isFull();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell11 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) ' ', (int) (short) 1, cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.String str4 = board3.toString();
        boolean boolean5 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Cell cell8 = null;
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell(10, (int) '#', cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveLeft();
        ar.edu.unrc.game2048.Cell cell5 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(0, (int) '#', cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.isLosingBoard();
        boolean boolean15 = board11.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean8 = board0.equals((java.lang.Object) "(4, 0)");
        ar.edu.unrc.game2048.Cell cell11 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 1, 1, cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        int int5 = board0.getScore();
        int int6 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        boolean boolean5 = position2.equals((java.lang.Object) 10);
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.hasEmptyCells();
        java.lang.Object obj8 = null;
        boolean boolean9 = board6.equals(obj8);
        java.lang.String str10 = board6.toString();
        boolean boolean11 = board6.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board6.getEmptyPositions();
        boolean boolean13 = board6.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board6.getEmptyPositions();
        boolean boolean15 = board6.isFull();
        ar.edu.unrc.game2048.Cell cell18 = board6.getCell(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 100, (int) (byte) 100, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        int int5 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 0)" + "'", str3, "(100, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.moveDown();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean9 = board0.equals((java.lang.Object) board8);
        boolean boolean10 = board8.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.repOK();
        boolean boolean8 = board0.repOK();
        java.lang.Class<?> wildcardClass9 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.isLosingBoard();
        int int15 = board11.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        boolean boolean8 = position2.equals((java.lang.Object) (-1.0f));
        int int9 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell16 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 10, 1, cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        boolean boolean8 = position2.equals((java.lang.Object) 4);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        boolean boolean10 = board9.hasEmptyCells();
        java.lang.Object obj11 = null;
        boolean boolean12 = board9.equals(obj11);
        java.lang.String str13 = board9.toString();
        boolean boolean14 = board9.hasEmptyCells();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean16 = position2.equals((java.lang.Object) board15);
        boolean boolean17 = board15.repOK();
        int int18 = board15.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.moveRight();
        boolean boolean8 = board6.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        boolean boolean5 = position2.equals((java.lang.Object) 10);
        int int6 = position2.col;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = position2.equals(obj7);
        java.lang.Class<?> wildcardClass9 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        boolean boolean5 = position2.equals((java.lang.Object) 10);
        int int6 = position2.col;
        java.lang.String str7 = position2.toString();
        java.lang.String str8 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(4, 0)" + "'", str7, "(4, 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(4, 0)" + "'", str8, "(4, 0)");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board0.getCell((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        int int7 = board0.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveLeft();
        boolean boolean4 = board1.repOK();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) (byte) 1);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 1)" + "'", str4, "(1, 1)");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.repOK();
        boolean boolean8 = board0.repOK();
        boolean boolean9 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        int int2 = board0.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.moveUp();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        boolean boolean8 = board7.hasEmptyCells();
        java.lang.Object obj9 = null;
        boolean boolean10 = board7.equals(obj9);
        java.lang.String str11 = board7.toString();
        boolean boolean12 = board7.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board7.getEmptyPositions();
        boolean boolean14 = board7.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board7.getEmptyPositions();
        boolean boolean16 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell19 = board7.getCell(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) 'a', 1, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str11, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board11.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        int int2 = board0.getSize();
        int int3 = board0.getSize();
        boolean boolean4 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.String str4 = board3.toString();
        boolean boolean5 = position2.equals((java.lang.Object) board3);
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(4, 0)" + "'", str6, "(4, 0)");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        boolean boolean3 = board0.hasEmptyCells();
        boolean boolean4 = board0.hasEmptyCells();
        boolean boolean5 = board0.moveUp();
        boolean boolean7 = board0.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.repOK();
        int int4 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        boolean boolean6 = board0.repOK();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board6.isLosingBoard();
        java.lang.Class<?> wildcardClass8 = board6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        int int5 = board0.getScore();
        boolean boolean6 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveUp();
        int int15 = board11.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        boolean boolean4 = board0.repOK();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        int int7 = board0.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.hasEmptyCells();
        boolean boolean10 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.repOK();
        boolean boolean8 = board0.repOK();
        java.lang.String str9 = board0.toString();
        boolean boolean10 = board0.repOK();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean14 = board13.isFull();
        java.lang.String str15 = board13.toString();
        boolean boolean16 = board13.moveRight();
        boolean boolean17 = board13.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(100, (int) (short) 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean15 = board11.equals((java.lang.Object) '4');
        boolean boolean16 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.hasEmptyCells();
        java.lang.Object obj8 = null;
        boolean boolean9 = board6.equals(obj8);
        java.lang.String str10 = board6.toString();
        boolean boolean11 = board6.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board6.getEmptyPositions();
        boolean boolean13 = board6.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board6.getEmptyPositions();
        boolean boolean15 = board6.isFull();
        ar.edu.unrc.game2048.Cell cell18 = board6.getCell(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(2048, 10, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isLosingBoard();
        boolean boolean6 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        boolean boolean11 = board10.hasEmptyCells();
        java.lang.Object obj12 = null;
        boolean boolean13 = board10.equals(obj12);
        java.lang.String str14 = board10.toString();
        boolean boolean15 = board10.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board10.getEmptyPositions();
        boolean boolean17 = board10.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board10.getEmptyPositions();
        boolean boolean19 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell22 = board10.getCell(1, (int) (byte) 1);
        board0.setCell((int) (short) 1, (int) (byte) 1, cell22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell22);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        java.lang.String str3 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.repOK();
        int int4 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        int int6 = board0.getScore();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        boolean boolean14 = board13.hasEmptyCells();
        java.lang.Object obj15 = null;
        boolean boolean16 = board13.equals(obj15);
        java.lang.String str17 = board13.toString();
        boolean boolean18 = board13.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board13.getEmptyPositions();
        boolean boolean20 = board13.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board13.getEmptyPositions();
        boolean boolean22 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell25 = board13.getCell(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 100, (int) (short) 10, cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell25);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        int int2 = board0.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.moveUp();
        java.lang.String str5 = board0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|    2|    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|    2|    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.isLosingBoard();
        boolean boolean15 = board11.moveRight();
        boolean boolean16 = board11.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        int int2 = board0.getSize();
        int int3 = board0.getSize();
        boolean boolean4 = board0.moveLeft();
        boolean boolean5 = board0.repOK();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, 0);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        int int4 = board3.getScore();
        int int5 = board3.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        boolean boolean7 = board3.moveUp();
        boolean boolean8 = position2.equals((java.lang.Object) boolean7);
        int int9 = position2.col;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (int) (short) 0);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        boolean boolean14 = board13.hasEmptyCells();
        java.lang.Object obj15 = null;
        boolean boolean16 = board13.equals(obj15);
        java.lang.String str17 = board13.toString();
        boolean boolean18 = board13.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board13.getEmptyPositions();
        boolean boolean20 = board13.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board13.getEmptyPositions();
        boolean boolean22 = board13.isFull();
        ar.edu.unrc.game2048.Cell cell25 = board13.getCell(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 100, (int) (byte) -1, cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell25);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 0);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        boolean boolean11 = board10.hasEmptyCells();
        java.lang.Object obj12 = null;
        boolean boolean13 = board10.equals(obj12);
        java.lang.String str14 = board10.toString();
        boolean boolean15 = board10.isFull();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean17 = board5.equals((java.lang.Object) board16);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean20 = board16.equals((java.lang.Object) '4');
        boolean boolean21 = board16.isLosingBoard();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        boolean boolean23 = board22.hasEmptyCells();
        java.lang.Object obj24 = null;
        boolean boolean25 = board22.equals(obj24);
        java.lang.String str26 = board22.toString();
        boolean boolean27 = board16.equals((java.lang.Object) str26);
        boolean boolean28 = board16.moveLeft();
        boolean boolean29 = board16.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board16.getEmptyPositions();
        boolean boolean31 = position2.equals((java.lang.Object) board16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 0)" + "'", str3, "(100, 0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 0)" + "'", str4, "(100, 0)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str26, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        boolean boolean3 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.col;
        int int7 = position2.col;
        int int8 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        boolean boolean5 = position2.equals((java.lang.Object) 10);
        int int6 = position2.col;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = position2.equals(obj7);
        java.lang.String str9 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(4, 0)" + "'", str9, "(4, 0)");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean14 = board13.isFull();
        java.lang.String str15 = board13.toString();
        boolean boolean16 = board13.moveRight();
        boolean boolean17 = board13.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) '#');
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.String str4 = board3.toString();
        boolean boolean5 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        boolean boolean9 = board8.hasEmptyCells();
        java.lang.Object obj10 = null;
        boolean boolean11 = board8.equals(obj10);
        java.lang.String str12 = board8.toString();
        boolean boolean13 = board8.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board8.getEmptyPositions();
        boolean boolean15 = board8.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board8.getEmptyPositions();
        boolean boolean17 = board8.isFull();
        ar.edu.unrc.game2048.Cell cell20 = board8.getCell(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell((int) 'a', (int) (byte) -1, cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str12, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.repOK();
        int int4 = board0.getScore();
        boolean boolean5 = board0.moveLeft();
        boolean boolean6 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board0.getEmptyPositions();
        boolean boolean10 = board0.repOK();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isLosingBoard();
        boolean boolean6 = board0.isWinningBoard();
        boolean boolean7 = board0.moveDown();
        int int8 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        int int14 = board13.getScore();
        boolean boolean15 = board13.moveUp();
        boolean boolean16 = board13.repOK();
        int int17 = board13.getScore();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        boolean boolean19 = board18.hasEmptyCells();
        java.lang.Object obj20 = null;
        boolean boolean21 = board18.equals(obj20);
        java.lang.String str22 = board18.toString();
        boolean boolean23 = board18.isFull();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board18);
        int int25 = board18.getScore();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean27 = board13.equals((java.lang.Object) board26);
        boolean boolean28 = board0.equals((java.lang.Object) board13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str22, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board11.hasEmptyCells();
        boolean boolean14 = board11.isLosingBoard();
        boolean boolean15 = board11.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isLosingBoard();
        boolean boolean6 = board0.isWinningBoard();
        boolean boolean7 = board0.moveDown();
        boolean boolean8 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board11.hasEmptyCells();
        boolean boolean14 = board11.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = board11.getCell((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        boolean boolean2 = board1.moveRight();
        boolean boolean3 = board1.moveUp();
        boolean boolean4 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        boolean boolean4 = board0.isFull();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.repOK();
        boolean boolean8 = board0.repOK();
        java.lang.String str9 = board0.toString();
        int int10 = board0.getScore();
        boolean boolean11 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.repOK();
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.repOK();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean14 = board13.isFull();
        java.lang.String str15 = board13.toString();
        java.lang.String str16 = board13.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        int int2 = board0.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.moveUp();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board11.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board11.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet14);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveUp();
        boolean boolean15 = board11.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        boolean boolean4 = board0.moveRight();
        int int5 = board0.getScore();
        boolean boolean6 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        int int6 = board0.getScore();
        boolean boolean7 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isFull();
        int int7 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        boolean boolean2 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(4, 0)" + "'", str4, "(4, 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(4, 0)" + "'", str5, "(4, 0)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean15 = board11.equals((java.lang.Object) '4');
        boolean boolean16 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        boolean boolean18 = board17.hasEmptyCells();
        java.lang.Object obj19 = null;
        boolean boolean20 = board17.equals(obj19);
        java.lang.String str21 = board17.toString();
        boolean boolean22 = board11.equals((java.lang.Object) str21);
        boolean boolean23 = board11.moveUp();
        boolean boolean24 = board11.moveRight();
        int int25 = board11.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str21, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(positionSet9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.isLosingBoard();
        int int3 = board0.getScore();
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.String str4 = board3.toString();
        boolean boolean5 = position2.equals((java.lang.Object) board3);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        boolean boolean2 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean14 = board11.equals((java.lang.Object) 10.0d);
        boolean boolean15 = board11.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.repOK();
        boolean boolean8 = board0.repOK();
        java.lang.String str9 = board0.toString();
        int int10 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(positionSet11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean14 = board13.isFull();
        boolean boolean15 = board13.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.repOK();
        int int4 = board0.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        int int12 = board5.getScore();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean14 = board0.equals((java.lang.Object) board13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        int int17 = board16.getScore();
        boolean boolean18 = board16.moveUp();
        boolean boolean19 = board16.moveLeft();
        boolean boolean20 = board0.equals((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean14 = board11.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.moveRight();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        boolean boolean11 = board10.hasEmptyCells();
        java.lang.Object obj12 = null;
        boolean boolean13 = board10.equals(obj12);
        java.lang.String str14 = board10.toString();
        boolean boolean15 = board10.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board10.getEmptyPositions();
        boolean boolean17 = board10.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board10.getEmptyPositions();
        boolean boolean19 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell22 = board10.getCell(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) -1, (int) 'a', cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell22);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, (int) (short) 10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.repOK();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.repOK();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        boolean boolean11 = board10.hasEmptyCells();
        java.lang.Object obj12 = null;
        boolean boolean13 = board10.equals(obj12);
        java.lang.String str14 = board10.toString();
        boolean boolean15 = board10.isFull();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean17 = board5.equals((java.lang.Object) board16);
        boolean boolean18 = board16.moveUp();
        int int19 = board16.getScore();
        boolean boolean20 = board0.equals((java.lang.Object) int19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        boolean boolean9 = board0.isFull();
        ar.edu.unrc.game2048.Cell cell12 = board0.getCell(1, (int) (byte) 1);
        boolean boolean13 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) (byte) 10);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 0);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 0)" + "'", str3, "(100, 0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 0)" + "'", str4, "(100, 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 0)" + "'", str5, "(100, 0)");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.repOK();
        java.lang.String str8 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        boolean boolean13 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.moveDown();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean9 = board0.equals((java.lang.Object) board8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        boolean boolean11 = board10.hasEmptyCells();
        boolean boolean12 = board10.isLosingBoard();
        boolean boolean13 = board10.hasEmptyCells();
        boolean boolean14 = board10.hasEmptyCells();
        boolean boolean15 = board0.equals((java.lang.Object) board10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.repOK();
        int int4 = board0.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        int int12 = board5.getScore();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean14 = board0.equals((java.lang.Object) board13);
        boolean boolean15 = board0.isFull();
        int int16 = board0.getSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.repOK();
        int int4 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.moveRight();
        java.lang.Class<?> wildcardClass4 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.hasEmptyCells();
        java.lang.Object obj2 = null;
        boolean boolean3 = board0.equals(obj2);
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.hasEmptyCells();
        java.lang.Object obj7 = null;
        boolean boolean8 = board5.equals(obj7);
        java.lang.String str9 = board5.toString();
        boolean boolean10 = board5.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean12 = board0.equals((java.lang.Object) board11);
        int int13 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveDown();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2048);
    }
}

