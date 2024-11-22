package com.example;

/**

1. Crea una base de datos en SQL Server con el nombre “refaccionaria” 
2. Agrega la tabla “Camion” que contenga los siguientes campos: 
    • Idcamion int 
    • Nombre Varchar(50) 
    • Totalmacenaje decimal(10,2) 
    • Placas Varchar(30) • Marca Varchar(30) 
3. Desarrolla una aplicación con el nombre “ProyectoRefaccionaria”. 
4. programa una aplicación que muestre diferentes criterios de filtrados en un DatagridView.
    • Solo es necesario el método buscar. 
    • La información extraída se debe de almacenar en un arreglo de objetos. En este caso un arreglo de tipo camión, estrictamente se debe crear una clase donde este la estructura del camión.
    • El método buscar deberá extraer toda la información de la base de datos (Sin criterios de filtrado “Select * from camion”) y por medio de un ciclo llenar objeto por objeto. poner un límite al arreglo
    • El resultado de la búsqueda (“Select * from camion”) debe de devolver el arreglo de camiones. 
    • Crea una clase que pueda realizar las búsquedas dinámicas directamente sobre el resultado a la que puedes llamar “ServicioCamiones”, es decir sobre el arreglo de objetos de camiones 
        que devuelve regresacamiones() y no dentro del método que se encuentra en DAO. 
    • La interfaz gráfica debe solo comunicarse con “ServicioCamiones” para enviarle los criterios de búsqueda

 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
