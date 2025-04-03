#!/bin/bash
# run.sh - Skrip awal Bash yang komprehensif
PROJECT_NAME="Proyek Repositori Otomatis GitHub"
VERSION="1.0.0"
function display_info() {
    echo "Proyek: ${PROJECT_NAME}, v${VERSION}"
}
function main() {
    display_info
    echo -e "\nFitur: Fungsi, Array, Perulangan"
    for i in {1..5}; do echo "  - Perulangan $i"; done
}
main
exit 0

# Diubah pada 2025-04-03T00:00:00