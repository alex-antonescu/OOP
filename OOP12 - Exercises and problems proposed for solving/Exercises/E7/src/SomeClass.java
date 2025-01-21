class SomeClass {
    public void foo(boolean b1, boolean b2) {
        if (b1 && b2)
            throw new E1();
        else
            throw new E2();
    }
}