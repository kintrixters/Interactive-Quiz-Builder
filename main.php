<!-- main.php - Skrip awal PHP yang komprehensif -->
<?php
class Project {
    public $name;
    public $version;

    public function __construct($name, $version) {
        $this->name = $name;
        $this->version = $version;
    }

    public function display() {
        echo "Proyek: {$this->name}, Versi: {$this->version}\n";
    }
}

$p = new Project("Proyek Repositori Otomatis GitHub", "1.0.0");
$p->display();
echo "\nFitur: Class, Konstruktor, Perulangan\n";
for ($i = 0; $i < 5; $i++) {
    echo "  - Iterasi " . ($i + 1) . "\n";
}
?>

# Diubah pada 2025-09-20T00:00:00