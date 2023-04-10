

    public class Kaffeemaschine {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Willkommen bei der Kaffeemaschine!");
            System.out.println("Bitte wählen Sie eine Option:");
            System.out.println("1 - Kaffee");
            System.out.println("2 - Espresso");
            System.out.println("3 - Cappuccino");
            System.out.println("4 - Heisse Schokolade");
            System.out.println("5 - Turkische Kaffe");
            System.out.println("6 - Milchkaffe");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Sie haben Kaffee gewählt.");
                    break;
                case 2:
                    System.out.println("Sie haben Espresso gewählt.");
                    break;
                case 3:
                    System.out.println("Sie haben Cappuccino gewählt.");
                    break;
                case 4:
                    System.out.println("Sie haben Heisse Schokolade gewählt.");
                    break;
                case 5:
                    System.out.println("Sie haben Turkische Kaffe gewählt.");
                    break;
                case 6:
                    System.out.println("Sie haben Milchkaffe gewählt.");
                    break;
                default:
                    System.out.println("Ungültige Option.");
                    break;
            }

            System.out.println("Vielen Dank für Ihren Kaufen!");
        }
    }

