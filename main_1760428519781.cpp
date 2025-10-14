// main.cpp - Skrip awal C++ yang komprehensif
#include <iostream>
#include <vector>
#include <string>
struct Project { std::string name; std::string version; };
void print_project_info(const Project& p) { std::cout << "Proyek: " << p.name << ", v" << p.version << std::endl; }
int main() {
    Project my_project = {"Proyek Repositori Otomatis GitHub", "1.0.0"};
    print_project_info(my_project);
    std::cout << "\nFitur: Struct, Fungsi, Vector" << std::endl;
    for (int i = 0; i < 5; ++i) { std::cout << "  - Perulangan " << i+1 << std::endl; }
    return 0;
}
