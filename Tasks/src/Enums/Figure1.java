package Enums;

enum Figure1 {

    CIRCLE(Integer.MAX_VALUE), SQUARE(4), TRIANGLE(3);

    private final int mEdgesCount;

    Figure1(final int edgesCount) {
        mEdgesCount = edgesCount;
    }

    public int edgesCount() {
        return mEdgesCount;
    }

}