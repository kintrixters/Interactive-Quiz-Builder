// main.go - Skrip awal Go yang komprehensif
package main
import "fmt"
type Project struct {
    Name    string
    Version string
}
func main() {
    p := Project{Name: "Proyek Repositori Otomatis GitHub", Version: "1.0.0"}
    fmt.Printf("Proyek: %s, Versi: %s\n", p.Name, p.Version)
    fmt.Println("\nFitur: Struct, Package, Perulangan")
    for i := 0; i < 5; i++ {
        fmt.Printf("  - Iterasi %d\n", i+1)
    }
}

# Diubah pada 2025-04-04T00:00:00