public class Main {
    public static void main(String[] args) {

        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("Iyi: geçtiniz");
                break;
            case 'D':
                System.out.println("Fena degil: geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef kaldiniz");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }

    }
}