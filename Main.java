// Main.java - Skrip awal Java yang komprehensif
public class Main {
    static class Project {
        String name;
        String version;
        Project(String name, String version) {
            this.name = name;
            this.version = version;
        }
        void display() {
            System.out.println("Proyek: " + this.name + ", Versi: " + this.version);
        }
    }
    public static void main(String[] args) {
        Project p = new Project("Proyek Repositori Otomatis GitHub", "1.0.0");
        p.display();
        System.out.println("\nFitur: Class Bersarang, Metode, Perulangan");
        for (int i = 0; i < 5; i++) {
            System.out.println("  - Iterasi " + (i + 1));
        }
    }
}

# Diubah pada 2025-06-02T00:00:00