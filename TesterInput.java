import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" CD/DVD? ");
        String pilihan = in.nextLine();

        System.out.println(" name: ");
        String name = in.nextLine();
        System.out.println(" Number: ");
        int number = in.nextInt();
        System.out.println(" Quantity: ");
        int quantity = in.nextInt();
        System.out.println(" Price: ");
        double price = in.nextDouble();
        in.nextLine(); //reset Scanner
        if (pilihan.equalsIgnoreCase(" CD ")) {
            System.out.println(" Artist: ");
            String artist = in.nextLine();
            System.out.println(" Label ");
            String label = in.nextLine();
            System.out.println(" Total Song: ");
            int numSong = in.nextInt();
            CD c1 = new CD(number, name, quantity, price, artist, numSong, label);
            c1.print();
        
        } else if(pilihan.equalsIgnoreCase(" DVD ")) {
            System.out.println(" length: ");
            int length = in.nextInt();
            System.out.println(" rating: ");
            String rating = in.nextLine();
            System.out.println(" studio: ");
            String studio = in.nextLine();
            DVD c2 = new DVD(number, name, quantity, price, length, rating, studio);
            c2.print();
        }
        in.close();  
    }
}

