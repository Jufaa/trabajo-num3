package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CellTest {

    @Test
    public void testConstructor() {
        Cell cell = new Cell(4);
        assertEquals(4, cell.getValue());
    }

    @Test
    public void testConstructorNumberNoPowerOfTwo(){
        assertThrows(IllegalArgumentException.class, () -> new Cell(5));
    }
    @Test
    public void testConstructorNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Cell(-4));
    }


    @Test
    public void testEmpty() {
        Cell cell = new Cell(0);
        assertTrue(cell.isEmpty());
    }

    @Test
    public void testEmpty2() {
        Cell cell = new Cell(2);
        assertFalse(cell.isEmpty());
    }

    @Test
    public void testEmpytyConstant() {
        assertTrue(Cell.EMPTY.isEmpty());
        assertEquals(0, Cell.EMPTY.getValue());
    }


    @Test
    public void testCanMergeWith() {
        assertTrue(new Cell(4).canMergeWith(new Cell(4)));
    }

    @Test
    public void testCanMergeWithDifferentValues() {
        assertFalse(new Cell(4).canMergeWith(new Cell(8)));
    }

    @Test
    public void testCanMergeWithEmptyValues() {
        assertFalse(Cell.EMPTY.canMergeWith(Cell.EMPTY));
    }


    @Test
    public void TestMergeWith() {
        Cell merged = new Cell(4).mergeWith(new Cell(4));
        assertEquals(8, merged.getValue());
    }

    @Test
    public void TestMergeWithDifferentsValues() {
        Cell cell = new Cell(4);
        Cell other = new Cell(8);
        assertThrows(IllegalArgumentException.class, () -> cell.mergeWith(other));
    }

    @Test
    public void testMergeWithEmptyValues() {
        assertThrows(IllegalArgumentException.class, () -> Cell.EMPTY.mergeWith(Cell.EMPTY));
    }

    @Test
    public void mergeDoesNotModifyOperands() {
        Cell cell1 = new Cell(4);
        Cell cell2 = new Cell(4);
        cell1.mergeWith(cell2);
        assertEquals(4, cell1.getValue());
        assertEquals(4, cell2.getValue());
    }

    @Test
    public void testHashCode() {
        assertEquals(new Cell(2).hashCode(), new Cell(2).hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("4", new Cell(4).toString());
    }

    @Test
    public void testToStringVacio() {
        assertEquals(".", Cell.EMPTY.toString());
    }

    @Test
    public void testEqualsSameInstance() {
        Cell cell = new Cell(4);
        assertTrue(cell.equals(cell));
    }

    @Test
    public void testEqualsDifferentValue() {
        assertNotEquals(new Cell(2), new Cell(4));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(new Cell(4).equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(new Cell(4).equals("4"));
    }

    @Test
    public void testHashCodeDiffersForDifferentValues() {
        assertNotEquals(new Cell(2).hashCode(), new Cell(4).hashCode());
    }
}
