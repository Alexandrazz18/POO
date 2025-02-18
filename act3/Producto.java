


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Producto;
/**
 *
 * @author xochi
 */
import java.util.Scanner;

public class Producto {
    // Atributo privado que almacena el código del producto
    private String codigo;
    
    // Atributo privado que indica el tipo del producto
    private String tipo;
    
    // Atributo privado que guarda el costo del producto
    private double costo;
    
    // Atributo privado que almacena el porcentaje de impuesto del producto
    private double impuesto;

    // Getter para obtener el valor del atributo 'codigo'
    public String getCodigo() {
        return codigo;
    }

    // Getter para obtener el valor del atributo 'tipo'
    public String getTipo() {
        return tipo;
    }

    // Getter para obtener el valor del atributo 'costo'
    public double getCosto() {
        return costo;
    }

    // Getter para obtener el valor del atributo 'impuesto'
    public double getImpuesto() {
        return impuesto;
    }

    // Setter para asignar un valor al atributo 'codigo'
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Setter para asignar un valor al atributo 'tipo'
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Setter para asignar un valor al atributo 'costo'
    public void setCosto(double costo) {
        this.costo = costo;
    }

    // Setter para asignar un valor al atributo 'impuesto'
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    // Método que muestra todos los atributos del producto en la consola
    public void muestraProducto() {
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: " + costo);
        System.out.println("Impuesto: " + impuesto + "%");
    }

    // Método que calcula el precio de venta del producto sumando la utilidad y el impuesto
    public double calcularPrecio(double utilidad) {
        // Se calcula el precio antes de impuestos sumando el costo y la utilidad
        double precioAntesDeImpuestos = costo + (costo * utilidad / 100);
        
        // Se calcula el precio final sumando el impuesto correspondiente
        double precioFinal = precioAntesDeImpuestos + (precioAntesDeImpuestos * impuesto / 100);
        
        return precioFinal; // Se devuelve el precio de venta total
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in) // Cerrar el objeto Scanner para liberar los recursos
        // Crear un objeto Scanner para leer la entrada del usuario
        ) {
            // Crear primer producto
            Producto producto1 = new Producto();
            System.out.println("Ingrese los datos del primer producto:");
            
            // Solicitar y asignar el código del producto
            System.out.print("Código: ");
            producto1.setCodigo(scanner.nextLine());
            
            // Solicitar y asignar el tipo del producto
            System.out.print("Tipo: ");
            producto1.setTipo(scanner.nextLine());
            
            // Solicitar y asignar el costo del producto
            System.out.print("Costo: ");
            producto1.setCosto(Double.parseDouble(scanner.nextLine()));
            
            // Solicitar y asignar el impuesto del producto
            System.out.print("Impuesto (%): ");
            producto1.setImpuesto(Double.parseDouble(scanner.nextLine()));

            // Crear segundo producto
            Producto producto2 = new Producto();
            System.out.println("\nIngrese los datos del segundo producto:");
            
            // Solicitar y asignar los datos del segundo producto
            System.out.print("Código: ");
            producto2.setCodigo(scanner.nextLine());
            System.out.print("Tipo: ");
            producto2.setTipo(scanner.nextLine());
            System.out.print("Costo: ");
            producto2.setCosto(Double.parseDouble(scanner.nextLine()));
            System.out.print("Impuesto (%): ");
            producto2.setImpuesto(Double.parseDouble(scanner.nextLine()));

            // Mostrar los datos del primer producto
            System.out.println("\nDatos del primer producto:");
            producto1.muestraProducto();

            // Mostrar los datos del segundo producto
            System.out.println("\nDatos del segundo producto:");
            producto2.muestraProducto();

            // Comparar los precios de los productos y mostrar el resultado
            String resultado = compararProductos(producto1, producto2);
            System.out.println("\nEl producto con el mayor precio de venta es: " + resultado);

        } catch (NumberFormatException e) {
            // Captura y manejo de excepciones en la entrada de datos
            System.out.println("Se ha producido un error en la entrada de datos: " + e.getMessage());
        }
    }

    // Método estático para comparar los precios de venta de dos productos
    public static String compararProductos(Producto p1, Producto p2) {
        // Calcular el precio de venta del primer producto con una utilidad del 20%
        double precioP1 = p1.calcularPrecio(20);
        
        // Calcular el precio de venta del segundo producto con la misma utilidad
        double precioP2 = p2.calcularPrecio(20);

        // Determinar cuál de los dos productos tiene un precio de venta mayor
        if (precioP1 > precioP2) {
            return p1.getCodigo() + " (" + p1.getTipo() + ")";
        } else if (precioP2 > precioP1) {
            return p2.getCodigo() + " (" + p2.getTipo() + ")";
        } else {
            return "Ambos productos tienen el mismo precio de venta.";
        }
    }
}

