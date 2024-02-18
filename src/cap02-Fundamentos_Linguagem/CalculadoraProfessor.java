public class CalculadoraProfessor {
    public static void main(String[] args) {
        // constante Pi
        float pi = 3.14f;

        // raio - informado pelo professor
        float raio = 5.3f;

        // área é igual ao raio ao quadrado multiplicado por pi
        float area = raio * raio * pi;
        System.out.println("A área do círculo é: " + area);

        int areaSemCasasDecimais = (int) area;
        System.out.println("A área do círculo sem casas decimais: " + areaSemCasasDecimais);
    }
}
