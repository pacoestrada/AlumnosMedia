public class Alumno {
    //creamos la clase alummno y sus atributos que son cuatro notas


    double notaMatematicas;
    double notaLengua;
    double notaHistoria;
    double notaIngles;

    //creamos un constructor vacio

    Alumno(){

    }
    //Creamos uns constructor con los cuatro parámetros

    Alumno( double notaHistoria, double notaIngles, double notaLengua, double notaMatematicas ){
        this.notaHistoria = notaHistoria;
        this.notaIngles = notaIngles;
        this.notaLengua = notaLengua;
        this.notaMatematicas = notaMatematicas;


    }

    //Creamos un el metodo notaMedia

    public double notaMedia(){
        return (notaMatematicas+notaLengua+notaIngles+notaHistoria)/4;
    }
}
