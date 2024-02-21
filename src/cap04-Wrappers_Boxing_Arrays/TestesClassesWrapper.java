public class TestesClassesWrapper {
    public static void main(String[] args) {
        // byte, short, int, long, float, double e char
        // Byte, Short, Integer, Long, Float, Double e Character

        int x = 5;
        Integer i = new Integer(5);
        // xxxValue();
        byte y = i.byteValue();

        String valor = "15.5";
        Float v = new Float(valor);
        System.out.println(v + 3);

        // parseXXX
        int idade = Integer.parseInt("27");
        System.out.println("Daqui a 5 anos você terá: " + (idade + 5) + " anos.");

        try {
            double custo = Double.parseDouble("Vinte e tres reais e cinquenta centavos.");
            System.out.println("Custo total: " + custo);
        } catch (NumberFormatException e) {
            System.out.println("Número inválido para conversão.");
        }
    }
}
