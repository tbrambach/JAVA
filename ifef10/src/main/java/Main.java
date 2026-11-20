public class Main {
    public static void main(String[] args) {
        int n = 23;

        if (n % 2 == 0) {
            System.out.println(n + " ist keine Primzahl.");
            return;
        }

        if (n % 3 == 0) {
            System.out.println(n + " ist keine Primzahl.");
            return;
        }

        if (n % 4 == 0) {
            System.out.println(n + " ist keine Primzahl.");
            return;
        }

        System.out.println(n + " ist eine Primzahl.");

        // Aufgabe 1: Ersetze die drei Teilertests durch eine Schleife.
        // Prüfe darin die Zahlen von 2 bis 4 als mögliche Teiler von 23.

        // Aufgabe 2: Erweitere deinen Code,
        // so dass er auch für andere Zahlen funktioniert.
        // Warum reicht es im Beispiel oben, die Zahlen bis 4 zu testen?
    }
}
