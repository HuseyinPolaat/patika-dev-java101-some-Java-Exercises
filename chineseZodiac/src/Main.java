import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthDate, result;
        String zodiac;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Tarihiniz? : ");
        birthDate = input.nextInt();
        result = birthDate % 12;
        zodiac ="";


        switch (result){
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
        }
        System.out.println("Çin zodyağı Burcunuz: " + zodiac);
    }
}
