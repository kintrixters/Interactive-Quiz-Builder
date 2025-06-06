// main.kt - Skrip awal Kotlin yang komprehensif
data class Project(val name: String, val version: String)
fun main() {
    val p = Project("Proyek Repositori Otomatis GitHub", "1.0.0")
    println("Proyek: ${p.name}, Versi: ${p.version}")
    println("\nFitur: Data Class, Fungsi main, Perulangan")
    for (i in 1..5) {
        println("  - Iterasi $i")
    }
}

# Diubah pada 2025-06-06T00:00:00