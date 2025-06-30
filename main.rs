// main.rs - Skrip awal Rust yang komprehensif
struct Project {
    name: String,
    version: String,
}
fn main() {
    let p = Project {
        name: String::from("Proyek Repositori Otomatis GitHub"),
        version: String::from("1.0.0"),
    };
    println!("Proyek: {}, Versi: {}", p.name, p.version);
    println!("\nFitur: Struct, Kepemilikan, Perulangan");
    for i in 0..5 {
        println!("  - Iterasi {}", i + 1);
    }
}

# Diubah pada 2025-06-30T00:00:00