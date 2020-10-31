package if1.pkg10119032.latihan30.cakep;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 */
public class IF110119032Latihan30Cakep {
    //kamus warna teks
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static void main(String[] args) {  
        //menampilkan pembuka program
        System.out.print(ANSI_RED + "Kamu " + ANSI_RESET);
        System.out.print(ANSI_GREEN + "ngerjain sendiri " + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "latihan 17 sampe " + ANSI_RESET);
        System.out.print(ANSI_BLUE + "latihan 30 ini?\nJawab " + ANSI_RESET);
        System.out.print(ANSI_RED + "(Yoi/Enggak) : " + ANSI_RESET);        
        Scanner scan = new Scanner(System.in);
        String opsi = scan.nextLine();
        
        //menampilkan hasil
        String opsiBesar = opsi.toUpperCase();
        switch(opsiBesar){
            case "YOI":
                System.out.print(ANSI_RED + "\nCakep bener. " + ANSI_RESET);
                System.out.println(ANSI_PURPLE + "Good Job " + ANSI_RESET);
                break;
            case "ENGGAK":
                System.out.println(ANSI_RED + "\nTetep cakep sih. " + ANSI_RESET);
                System.out.println(ANSI_CYAN + "Sing penting paham konsep nya yee. " + ANSI_RESET);
                System.out.println("Keep the code works dude");
                break;  
            default:
                System.out.println("Cukup jawab (Yoi/Enggak) aja cuyyy");
        }
    }
    
}
