#!/bin/bash

# Script para buscar y listar todas las clases en archivos .java dentro de carpetas 'src'.
# Uso: ./buscar_clases.sh /ruta/raiz

# Directorio raíz donde buscar
ROOT_DIR=$1

# Verificar si se proporciona el argumento
if [ -z "$ROOT_DIR" ]; then
    echo "Uso: $0 /ruta/raiz"
    exit 1
fi

# Verificar si el directorio existe
if [ ! -d "$ROOT_DIR" ]; then
    echo "Error: El directorio '$ROOT_DIR' no existe."
    exit 1
fi

echo "Buscando todas las clases dentro de carpetas 'src' en '$ROOT_DIR'...\n"

# Buscar todos los archivos .java dentro de carpetas 'src'
find "$ROOT_DIR" -type f -path "*/src/*.java" | while read -r file; do
    # Extraer el nombre de la clase del archivo
    class_name=$(grep -Eo "class [A-Za-z0-9_]+" "$file" | awk '{print $2}')
    
    # Si se encontró una clase, imprimir el nombre y la ruta
    if [ ! -z "$class_name" ]; then
        echo "Clase encontrada: '$class_name' en archivo: $file"
    fi
done

echo -e "\nBúsqueda completada."

