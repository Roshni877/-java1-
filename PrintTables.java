public class PrintTables {
    public static void main(String[] args) {
        for (int table = 3; table <= 8; table++) {
            System.out.println("Table of " + table);
            for (int i = 1; i <= 10; i++) {
                System.out.println(table + " x " + i + " = " + (table * i));
            }
            System.out.println();
        }
    }
}
