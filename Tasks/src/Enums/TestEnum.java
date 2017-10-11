package Enums;

import Enums.SimpleFigure.Figure;

class TestEnum {

    static int edgesCountOrThrow(final Figure figure) throws Exception {
        switch (figure) {
            case CIRCLE:
                return Integer.MAX_VALUE;
            case SQUARE:
                return 4;
            case TRIANGLE:
                return 3;
            default:
                throw new Exception("No such figure.");
        }
    }

}