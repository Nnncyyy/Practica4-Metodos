struct Contacto {
    char nombre[50];
    char telefono[15];
    char email[50];
};

void agregarContacto(struct Contacto contactos[], int *num_contactos) {
    if (*num_contactos >= 100) {
        printf("No se pueden agregar más contactos.\n");
        return;
    }

    printf("Ingrese el nombre: ");
    scanf("%s", contactos[*num_contactos].nombre);
    
    printf("Ingrese el teléfono: ");
    scanf("%s", contactos[*num_contactos].telefono);
    
    printf("Ingrese el correo electrónico: ");
    scanf("%s", contactos[*num_contactos].email);

    (*num_contactos)++;
    printf("Contacto agregado con éxito.\n");
}
