//aqui vamos a crear una tienda de dulces

//primero creamos una clase nodo creamos dos variables para 
//el nombre del dulce y su precio
//y tiene un atributo nodo que da la direccion
public class nodo {
    String nombreDulces;
    double precioDulces;
    nodo siguiente;
    
}
//creamos una interfase llamada listable y creamos los metodos
public interface listable {
    public void insertarDulces(String nombreDulces,double precioDulces);
    public void mostrar();
    public void seleccionar(String nombreDulce);
}
//creamos una clase llamada listaSimple que implemente la interfase anterior
public class listaSimple implements listable{
//con variable estatica para el logger y variables de tipo de nodo primero
y ultimo para determinar el orden de los elemenots    
static Logger log = Logger.getLogger(listaSimple.class.getName());
    nodo primero;
    nodo ultimo;
    //constructor para determinar los valores
    public listaSimple(){
        primero=null;
        ultimo=null;
    }
//metodo implementado para insertar los dulces

    @Override
    public void insertarDulces(String nombreDulces, double precioDulces) {
//esta instancia de tipo nodo nos permite insertar un nuevo elemento        
nodo nuevoNodo= new nodo();
//colocamos los atributos correspondientes en el objeto
        nuevoNodo.nombreDulces=nombreDulces;
        nuevoNodo.precioDulces=precioDulces;
//si la lista esta vacia
primero/ultimo->null
        if(primero==null){
            primero=nuevoNodo;
            primero.siguiente=null;
            ultimo=primero;
        }else{
//sino primero->ultimo->null
            ultimo.siguiente=nuevoNodo;
            nuevoNodo.siguiente=null;
            ultimo=nuevoNodo;
        }
    }
//metodo de la interface para mostrar
    @Override
    public void mostrar() {
        nodo actual = new nodo();//instancia de referencia
        actual=primero;//este se contara desde el primero
        while(actual!=null){//mientras actual no llegue a nulo hacer
            log.info(actual.nombreDulces+ "= $"+actual.precioDulces);//mostrar los datos de referencia
            actual=actual.siguiente;//y se recorre la lista
        }
    }

//interface implemetada para mostrar que dulce hemos comprado
    @Override
    public void seleccionar(String nombreDulce) {
        nodo actual = new nodo();//instancia de referencia
        actual=primero;//la referencia se toma desde el primero
        while(actual!=null){//mientras actual se diferente de null
            if(actual.nombreDulces.contains(nombreDulce)){//si el nombre del 
//dulce del recorrido es contiene el nombre del parametro mostrara:
                log.info("Ha seleccionado: "+actual.nombreDulces+" pague "+actual.precioDulces+" pesos");
            }
//se sigue recorriendo el bucle
            actual=actual.siguiente;
            
        }
    }
    
    
    
    
}
//implemetacion de los metodos  en la clase principal(tienda)
public class tienda {
    static Logger log = Logger.getLogger(listaSimple.class.getName());
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        listaSimple lista= new listaSimple();
        String seleccionar;
        lista.insertarDulces("chocoramo", 1000);
        lista.insertarDulces("gala", 1200);
        
        lista.mostrar();
        
        log.info("Digite que desea comprar:");
        seleccionar=leer.next();
        lista.seleccionar(seleccionar);
        
    }
}

