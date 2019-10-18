import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tab = new String[5];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Please give another name: ");
            tab[i] = sc.nextLine();
        }

        for (String table : tab) {
            System.out.println(table);
        }
        System.out.println("-----------------------------------");
        String nam[] = new String[tab.length];
        int n = tab.length - 1;
        int j = n;
        for (int i = 0; i <= n; i++) {
            nam[i] = tab[j];
            j--;
        }
        for (String table : nam) {
            System.out.println("Hay : " + table);
        }
    }
}

