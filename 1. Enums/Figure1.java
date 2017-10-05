enum Figure1 {
    CIRCLE(Integer.MAX_VALUE), SQUARE(4), TRIANGLE(3);
    
    private final int edges;
    
    Figure1(final int edges) {
      this.edges = edges;
    }
    
    public int edgesCount() {
        return edges;
    }
}