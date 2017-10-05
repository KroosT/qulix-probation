enum Figure1 {
    CIRCLE(Integer.MAX_VALUE), SQUARE(4), TRIANGLE(3);
    
    private int edges;
    
    Figure1(int edges) {
      this.edges = edges;
    }
    
    public int edgesCount() {
        return edges;
    }
}