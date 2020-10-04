class SimpleCounter {
    public int counter;
    private SimpleCounter() {}
    private static SimpleCounter instance = new SimpleCounter();
    public static SimpleCounter getInstance() {
        return instance;
    }
}