Apartado 5 del punto 1:Tanto el factorial como la potencia alcanzan rápidamente resultados muy elevados, con lo que
puede superarse el límite para el tipo de datos int. ¿Como evitarías los problemas de
desbordamiento? (Escribir respuesta en el README.txt)
Pues en ves de que sea int que sea un tipo de dato long ya que es tipo de dato mas grande que existe een java

Apartado 2 del punto 2:
lo que le falta es un caso base,porque si no lo tiene la recursion se va a repetir una y otra vez

Apartado 3 del punto 2:
como se explico en el punto anterior la causa es porque no hay un caso base y la correccion es la siguiente:
public static int mcd(int a,int b){
      if(b==0){
       return a;
        }else{
        return mcd(b, a%b);
    }
}
apartado 4 del punto 2:
 public static int mcd(int a, int b) {
        log.info("inicio de mcd(96, 36)");
        if (b == 0) {
            log.info("fin de mcd(96, 36)");

            return a;
        }
        log.info("fin de mcd(96, 36)");
        return mcd(b, a % b);
    }
20/Sep/2021 20:02:25,492- Mcd: inicio de mcd(96, 36)
20/Sep/2021 20:02:25,493- Mcd: fin de mcd(96, 36)
20/Sep/2021 20:02:25,493- Mcd: inicio de mcd(96, 36)
20/Sep/2021 20:02:25,494- Mcd: fin de mcd(96, 36)
20/Sep/2021 20:02:25,494- Mcd: inicio de mcd(96, 36)
20/Sep/2021 20:02:25,494- Mcd: fin de mcd(96, 36)
20/Sep/2021 20:02:25,494- Mcd: inicio de mcd(96, 36)
20/Sep/2021 20:02:25,495- Mcd: fin de mcd(96, 36)
20/Sep/2021 20:02:25,495- Mcd: mcd (96,36)=12

podemos deducir que dio ese resultado debido a que en en cada resultado no solo nos ofrece el fin sino que tambien 
ṕor la recursividad del programa el metodo invoca tambien el texto de inicio


apartado 2 del punto 3:
public static double sucesion(int n) {//n==10
        contador++;
        switch (n) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0.91 * sucesion(n - 1) + 0.1 * sucesion(n - 2);
        }
        
    }
    public static void mostrarContador(){
       log.info("la cantidad de veces que se ejecuta el metodo:"+contador);
    }
20/Sep/2021 21:28:36,281- MainSucesion: 2.0737240167276587
20/Sep/2021 21:28:36,286- MainSucesion: la cantidad de veces que se ejecuta el metodo:177

Como vemos el numero de veces que se ejecuta es absurdo y la razon de la de porque se repite es que al ser recursivo en dos ocaciones
y al repetir operaciones pues hace que los procesos se aumenten a un nivel exponencial