public class Run {
    public static void main(String[] args) {

    }

    public static String obtenerNota(int grade) {
        String result = "";
        switch (grade / 10) {
            case 10, 9 ->result= "A";
            case 8->result = "B";
            case 7->result ="C";
            case 6->result = "D";
            default -> result = "F";
        }

        return result;

    }
}