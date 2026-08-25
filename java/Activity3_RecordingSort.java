import java.util.Scanner;

public class Activity3_RecordingSort {

    // Inner class for Recording
    static class Recording {
        private String title;
        private String artist;
        private int playTime; // in seconds

        // Setters
        public void setTitle(String t) {
            title = t;
        }

        public void setArtist(String a) {
            artist = a;
        }

        public void setPlayTime(int p) {
            playTime = p;
        }

        // Getters
        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public int getPlayTime() {
            return playTime;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many recordings the user wants
        System.out.print("How many recordings do you want to enter? ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        Recording[] rec = new Recording[size];

        // Step 1: Input recordings
        for (int i = 0; i < rec.length; i++) {
            rec[i] = new Recording();
            System.out.println("\nEnter details for Recording " + (i+1));

            System.out.print("Title: ");
            rec[i].setTitle(sc.nextLine());

            System.out.print("Artist: ");
            rec[i].setArtist(sc.nextLine());

            System.out.print("Play time (seconds): ");
            rec[i].setPlayTime(sc.nextInt());
            sc.nextLine(); // consume leftover newline
        }

        // Step 2: Ask sort field (number choice)
        System.out.println("\nChoose how to sort:");
        System.out.println("1 - Title");
        System.out.println("2 - Artist");
        System.out.println("3 - Time");
        int choice = sc.nextInt();

        // Step 3: Sort recordings
        sortRecordings(rec, choice);

        // Step 4: Display only the chosen field
        System.out.println("\nSorted Output:");
        for (int i = 0; i < rec.length; i++) {
            if (choice == 1) {
                System.out.println(rec[i].getTitle());
            } else if (choice == 2) {
                System.out.println(rec[i].getArtist());
            } else if (choice == 3) {
                System.out.println(rec[i].getPlayTime() + "s");
            }
        }
    }

    // Bubble sort method
    public static void sortRecordings(Recording[] rec, int choice) {
        for (int i = 0; i < rec.length - 1; i++) {
            for (int j = 0; j < rec.length - i - 1; j++) {
                boolean swap = false;

                if (choice == 1) { // sort by title
                    if (rec[j].getTitle().compareTo(rec[j+1].getTitle()) > 0) {
                        swap = true;
                    }
                } else if (choice == 2) { // sort by artist
                    if (rec[j].getArtist().compareTo(rec[j+1].getArtist()) > 0) {
                        swap = true;
                    }
                } else if (choice == 3) { // sort by time
                    if (rec[j].getPlayTime() > rec[j+1].getPlayTime()) {
                        swap = true;
                    }
                }

                // Swap if needed
                if (swap) {
                    Recording temp = rec[j];
                    rec[j] = rec[j+1];
                    rec[j+1] = temp;
                }
            }
        }
    }
}
