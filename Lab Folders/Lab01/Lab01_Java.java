// COPYRIGHT (C) HARRY CLARK 2025

// LAB 1 FILL-IN

// NOT MUCH TO POINT OUT OTHER THAN THAT THIS LAB IS JUST A MEANS OF GETTING TO GRIPS WITH GITHUB

public final class LAB_01
{
    private static final int a = 3;
    private static final int b = 7;
    private static final int y = 10;
    private static final int z = 5;

    public final static void TEST_METHOD_1()
    {
        final int x = y + z;
        System.out.println(x); 

        System.out.println("Goodbye");
    }

    public final static void TEST_METHOD_2()
    {
        final int x = a * b;
        final int y = x + 5;

        System.out.println(y);
    }

    public final static void LAB_01_MAIN(String[] args)
    {
        TEST_METHOD_1();
        TEST_METHOD_2();
    }
}
