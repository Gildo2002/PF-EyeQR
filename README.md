# Prototipo de EyeQR usando la API de Google ML Kit.

## Descripcion.
Como se ha mencionado anteriomente, la aplicacion esta dirigida a solucionar o mejorar la condicion actual que tienen las personas con discapacidad visual para poder identificar con mas detalles objetos con caracteristicas similares, principalmente productos que podemos encontrar en los supermercados.

## Herramientas usadas.
### API de Google ML Kit.
Para el desarrollo de la aplicacion se uso el API de Google ML Kit, que cuenta con muchas herramientas como auto-aprendizaje, identificacion de objetos o realidad aumentada.

Con la API de escaneo de códigos de barras de ML Kit, puede leer datos codificados utilizando la mayoría de los formatos de códigos de barras estándar. El escaneo de código de barras ocurre en el dispositivo y no requiere una conexión de red.

Los códigos de barras son una forma conveniente de pasar información del mundo real a su aplicación. En particular, cuando se utilizan formatos 2D como el código QR, puede codificar datos estructurados como información de contacto o credenciales de red WiFi. Debido a que ML Kit puede reconocer y analizar automáticamente estos datos, su aplicación puede responder de manera inteligente cuando un usuario escanea un código de barras.

<p align="center">
  <img src="https://i.imgur.com/4e4csFD.png" width="720"/>
</p>


Entrando en detalles mas tecnicos podemos mencionar:
- Detección de código de barras
- Ancho de retícula de código de barras: tamaño del ancho de retícula de código de barras relativo al ancho de vista previa de la cámara
- Altura de retícula de código de barras: tamaño de la altura de retícula del código de barras en relación con la altura de vista previa de la cámara
- Habilitar la comprobación del tamaño del código de barras: indicará al usuario que se "acerque" si el código de barras detectado es demasiado pequeño
- Resultado de carga diferida: simula un caso en el que el código de barras detectado requiere un procesamiento adicional antes de mostrar el resultado.

### Text to speech.
Sintetiza la voz del texto para su reproducción inmediata o para crear un archivo de sonido. En una libreria que viene por defecto en todos los dispotivos con sistema operativo Android.

### Base de datos JSON.
JSON (JavaScript Object Notation - Notación de Objetos de JavaScript) es un formato ligero de intercambio de datos. Leerlo y escribirlo es simple para humanos, mientras que para las máquinas es simple interpretarlo y generarlo. JSON es un formato de texto que es completamente independiente del lenguaje pero utiliza convenciones que son ampliamente conocidos por los programadores de la familia de Java. Estas propiedades hacen que JSON sea un lenguaje ideal para el intercambio de datos.

Se usaron principalmente para guardar los datos relevantes que necesite un persona a la hora de elegir un productos. Tales parametros son:

|NOMBRE          |PRECIO  |CATEGORIA  |DEPARTAMENTO |SKU  |LINK |
|----------------|--------|-----------|-------------|-----|-----|

## Desarrollo.
Para este proyecto se contaba con un aplicacion prototipo que a pesar de cumplir con el objetivo principal de *identificar objetos y brindar la informacion a los usuarios* fue desarrollado cuando no se tenia una buena base de programacion y la motivacion era baja. Por lo tanto se desecho la idea de reutilizar la aplicacion prototipo.

Cuando se planteo la fase de diseño se habia planteado crear todo desde cero, pero debido a la dificultades actuales por la pandemia y algunos de los integrantes se planteo usa el codigo de ejemplo de **ML Kit Vision Showcase App with Material Design** el cual podriamos aplicar perfectamente para nuestro propio desarrollo.

Por ejemplo podemos ver como funciona el reconocimiento de codigo de barra (tambien funciona igual con los codigos QR).
<p align="center">
  <img src="https://github.com/googlesamples/mlkit/raw/master/android/material-showcase/screenshots/live_barcode.gif" width="256"/> 
</p>

Una vez tenemos la parte principal de la aplicacion debiamos pasar al vincular los codigos escaneados con informacion que le sea util. 
Se procedio a utilizar ---- para obtener datos que nos fueran de utilidad en esta etapa de prototipo. Al final lo alojamos en un archivo JSON que funciona como una base de datos para guardar la informacion de todos los productos. Claro esta que la base de datos no cuenta con todos los productos que tiene un supermercado pero bastante de ellos son comunes y nos permite hacer pruebas de funcionamiento y rendimiento.

[Imgur](https://i.imgur.com/JTLcJ3a.gifv)

Cuando teniamos la base 


