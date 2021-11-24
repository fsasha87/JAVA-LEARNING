package enums.ex4;

public enum Operation {
    SUM{
        @Override
        public int action(int x, int y) {
            return x+y;
        }
    },
    SUBTRACT {
        @Override
        public int action(int x, int y) {
            return x-y;
        }
    },
    MULTIPLY {
        @Override
        public int action(int x, int y) {
            return x*y;
        }
    };
    public abstract int action (int x, int y);
}
