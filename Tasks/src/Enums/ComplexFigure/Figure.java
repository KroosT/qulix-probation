package Enums.ComplexFigure;

enum Figure {

    CIRCLE(Integer.MAX_VALUE), SQUARE(4), TRIANGLE(3);

    private final int mEdgesCount;

    Figure(final int edgesCount) {
        mEdgesCount = edgesCount;
    }

    public int edgesCount() {
        return mEdgesCount;
    }

}