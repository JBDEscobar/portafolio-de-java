package vistas;
public class vista {

    public static void baner(){
       String lista []= {
        "+---------------------+",
            "[1]. Suma de dos números",
            "[2]. Resta de dos números",
            "[3]. Multiplicación de dos números",
            "[4]. División de dos números",
            "[5]. Módulo (Residuo de una división)",
            "[6]. promedio de tres números",
            "[7].Número mayor y menor entre dos números",
            "[8]. Número mayor y menor entre tres números",
            "[9]. Conversión de metros a centímetros",
            "[10]. Conversión de kilogramos a gramos"

       };
       //metodo mostrar opciones 
       public static void opciones(){
        for (int i = 0; i < lista.length; i++) {
            System.out.println("["+(i+1) + " ]"+lista[is]);
            
        }
       }
    }
}

    

