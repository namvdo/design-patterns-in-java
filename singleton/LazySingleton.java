public class LazySingleton {
    private LazySingleton instance;
    private LazySingleton () {

    }
    public static LazySingleton getInstace() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instace;
    }
}