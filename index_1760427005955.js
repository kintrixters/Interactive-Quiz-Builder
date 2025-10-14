// index.js - Skrip awal Node.js yang komprehensif
class Project {
    constructor(name) { this.name = name; this.version = "1.0.0"; }
    displayInfo() { console.log(`Proyek: ${this.name}, v${this.version}`); }
}
const main = () => {
    const myProject = new Project("Proyek Repositori Otomatis GitHub");
    myProject.displayInfo();
    console.log("\nFitur: Class, Arrow Functions, Perulangan");
    for (let i = 0; i < 5; i++) { console.log(`  - Perulangan ${i + 1}`); }
};
main();
