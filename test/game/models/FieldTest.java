package game.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void setStateField() {
    }

    @Test
    public void setCellFild() {
        Field field = new Field(3);
        String[][] state = field.getStateField();
        String checkedValue = "1";
        field.setCellFild(0,0, checkedValue );
        String realValue = state[0][0];
        assertEquals(checkedValue, realValue);




    }

    @Test
    public void getSIZE_FIELD() {
    }

    @Test
    public void getStateField() {
    }

    @Test
    public void getDEFAULT_SYMBOL() {
    }

    @Test
    public void getMIN_NUMBER() {
    }

    @Test
    public void getMAX_NUMBER() {
    }
}