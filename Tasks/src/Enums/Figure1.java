package Enums;

enum Figure1 {

    CIRCLE(Integer.MAX_VALUE), SQUARE(4), TRIANGLE(3);

    private final int mEdges;

    Figure1(final int edges) {
        mEdges = edges;
    }

    public int edgesCount() {
        return mEdges;
    }

}