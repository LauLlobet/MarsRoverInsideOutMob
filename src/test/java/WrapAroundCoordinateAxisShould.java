import org.junit.Test;

import static org.junit.Assert.*;

public class WrapAroundCoordinateAxisShould {
    @Test
    public void provide_postion_at_West() {
        WrapAroundCoordinateAxis wrapAroundCoordinateAxis = new WrapAroundCoordinateAxis(10);

        int nextpostion = wrapAroundCoordinateAxis.positionAtWestOf(1);

        assertEquals(0, nextpostion);
    }

    @Test
    public void provide_position_at_West_from_another_point() {
        WrapAroundCoordinateAxis wrapAroundCoordinateAxis = new WrapAroundCoordinateAxis(10);

        int nextposition = wrapAroundCoordinateAxis.positionAtWestOf(2);

        assertEquals(1, nextposition);
    }

    @Test
    public void wrap_around_postions() {
        WrapAroundCoordinateAxis wrapAroundCoordinateAxis = new WrapAroundCoordinateAxis(5);

        int nextposition = wrapAroundCoordinateAxis.positionAtWestOf(0);

        assertEquals(4,nextposition);
    }

    @Test
    public void wrap_around_position_when_bigger_than_with() {
        WrapAroundCoordinateAxis wrapAroundCoordinateAxis = new WrapAroundCoordinateAxis(5);

        int nextposition = wrapAroundCoordinateAxis.positionAtEastOf(4);

        assertEquals(0,nextposition);
    }

    @Test
    public void provide_position_at_East_from_another_point() {
        WrapAroundCoordinateAxis wrapAroundCoordinateAxis = new WrapAroundCoordinateAxis(10);

        int nextposition = wrapAroundCoordinateAxis.positionAtEastOf(2);

        assertEquals(3, nextposition);
    }

}