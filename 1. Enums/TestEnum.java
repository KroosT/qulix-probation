class TestEnum {

    static int edgesCount(final Figure2 f) {
        switch (f) {
            case CIRCLE:
                return Integer.MAX_VALUE;
            case SQUARE:
                return 4;
            case TRIANGLE:
                return 3;
            default:
                return -1;
        }
    }
    
}