import junit.framework.TestCase;

public class FactorialTest extends TestCase {
    public void testFactorial() {
        // Simple tests hvor x er henholdsvis 4, 5, og 6.
        // Input: x = 4, x = 5, x = 6
        // Forventet output = 24, output = 120, output = 720

        int x = 4;
        int output = Factorial.findFactorial(x);
        assertEquals(24, output);

        x = 5;
        output = Factorial.findFactorial(x);
        assertEquals(120, output);

        x = 6;
        output = Factorial.findFactorial(x);
        assertEquals(720, output);


        // x skal returnere 1 hvis x er 0 da det er definitionen.

        x = 0;
        output = Factorial.findFactorial(x);
        assertEquals(1, output);

        // x må ikke være negativ (f.eks. -5) og skal returnere -1 hvis det er tilfældet.

        x = -5;
        output = Factorial.findFactorial(x);
        assertEquals(-1, output);

        // x må ikke være højere end 19 (F.eks. 20) og skal returnere -1 hvis det er tilfældet.
        // Grunden er at int ikke kan rumme højere end 19.

        x = 20;
        output = Factorial.findFactorial(x);
        assertEquals(-1, output);
    }
}
