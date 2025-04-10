# QuizJavaPapeleria


## Consultas

**1. Ventas realizadas por un empleado con sus respectivos clientes**

URL GET: http://localhost:8080/api/empleados/{id}/ventas-con-clientes

**2. Listar productos que ofrece un proveedor**

URL GET: http://localhost:8080/api/proveedores/{id}/productos

**3. Listar los clientes con el detalle de venta**

URL GET: http://localhost:8080/api/clientes/detalles-venta

**4. Listar ventas de un empleado por fecha**

URL POST: http://localhost:8080/api/empleados/{id}/ventas-por-fecha

CUERPO JSON:

`{
"fechaInicio": "2024-01-01",
"fechaFin": "2024-12-31"
}`


## Agregar Datos

**EMPLEADO**

POST http://localhost:8080/api/empleados

JSON:

`{
"nombre": "Carlos Ruiz",
"cargo": "Vendedor",
"telefono": "3001112233"
}`

**CLIENTE**

POST  http://localhost:8080/api/clientes

JSON

`{
"nombre": "Juan Pérez",
"correo": "juan@gmail.com",
"telefono": "3001122334",
"cedula": "1234567890"
}`

**VENTA CON CLIENTE Y EMPLEADO**
POST  http://localhost:8080/api/ventas

JSON

`{
"fecha": "2024-04-10",
"hora": "15:00",
"empleado": {
"idEmpleado": 1
},
"cliente": {
"idCliente": 1
}
}`

**PROVEEDOR**

POST  http://localhost:8080/api/proveedores

JSON

`{
"nombre": "Distribuciones La 14",
"telefono": "3124567890",
"correo": "la14@proveedores.com",
"direccion": "Cra 14 #15-20, zipaquira",
"productos": [
{
"nombre": "Cuaderno Norma",
"precio": 3500,
"stock": 100
},
{
"nombre": "Lapicero BIC",
"precio": 1200,
"stock": 300
}
]
}`

**PRODUCTOS RELACIONADOS A PROVEEDOR**

POST  http://localhost:8080/api/productos

JSON

`{
"nombre": "Lápiz HB",
"precio": 800,
"stock": 500,
"proveedor": {
"idProveedor": 1
}
}`

