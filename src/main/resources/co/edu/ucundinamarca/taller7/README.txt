En el ejercicio 1 realizamos una clase llamada nodo la cual nos da los atributos
basicos de la identificacion,nombre y libro con los movimientos del nodo
una clase llamda ColaBiblioteca en la que implementamos todos estos metodos
y se raliza por medio de una lista circular doble
public class ColaBiblioteca {
    static Logger log = Logger.getLogger(ColaBiblioteca.class.getName());

    Nodo primero;
    Nodo ultimo;
    private int numeroDeTurno=0;
    private int numeroDeAtendidos=0;

    public int getNumeroDeTurno() {
        return numeroDeTurno;
    }

    public int getNumeroDeAtendidos() {
        return numeroDeAtendidos;
    }
    
    public ColaBiblioteca(){
        primero=null;
        ultimo=null;
    }
    public void ingresarPorAtender(String identificacion,String nombre,String tituloLibro){
        Nodo nuevo= new Nodo();
        nuevo.setIdentificacion(identificacion);
        nuevo.setNombre(nombre);
        nuevo.setTituloLibro(tituloLibro);
        if(primero==null){
            primero=nuevo;
            primero.siguiente=primero;
            nuevo.anterior=ultimo;
            ultimo=nuevo;
        }else{
         
            ultimo.siguiente=nuevo;
            
            nuevo.siguiente=primero;
            nuevo.anterior=ultimo;
            ultimo=nuevo;
            primero.anterior=ultimo;
        }
        numeroDeTurno++;
    }
    public void mostrarPorAtender(){
        Nodo actual= new Nodo();
        actual=primero;
        do{
            log.info("Identificación:"+actual.getIdentificacion()+"\nnombre:"
              +actual.getNombre()+"\nlibro prestado:"+actual.getTituloLibro());
            actual=actual.siguiente;
        }while(actual!=primero);
    }
    
    public void atendido(){
        Nodo actual= new Nodo();
        Nodo anterior= new Nodo();
         
        actual=primero;
        anterior=ultimo;
        
        if(actual==primero){
            log.info(actual.getNombre()+" con identificación: "+actual.getIdentificacion()+" atendido");
           
            primero=primero.siguiente;
            ultimo.siguiente=primero;
            primero.anterior=ultimo;
          
        }
        numeroDeAtendidos++;
      
        anterior=actual;
        actual=actual.siguiente;
      
      
    }
    
}
y una clase principal en al que se implementan todos estos metodos
este el ejercicio que no resolvi por completo

los otros dos como si como el profe los ordeno

en el ejercicio dos se crea una clase llamado nodo para implementar los atributos basicos
y de nodo
en la PilaLista se implementan los siguientes metodos se usa una pila 
public class PilaLista {
    private nodo ultimovaloringresado;
    int tamaño=0;
    String lista="";
    //constructor

    public PilaLista() {
    ultimovaloringresado=null;
    tamaño=0;
    }
    //verificar si la pila esta vacia
    public boolean PilaVacia(){
        return ultimovaloringresado==null;
    }
    //metodo para insertar en la pila
    public void insertar_Push(Object elemento){
        nodo nuevo=new nodo(elemento);
        nuevo.siguiente=ultimovaloringresado;
        ultimovaloringresado=nuevo;
        tamaño++;
        
    }
    //metodo para eliminar elemento de la pila, Recuperar un objeto de la pila
    public Object eliminarNodo_Pop(){
        Object auxiliar=ultimovaloringresado.elemento;
        ultimovaloringresado=ultimovaloringresado.siguiente;
        tamaño--;
        return auxiliar;
    }
    //Obtener el objeto de la cima (top) de la pila, sin extraerlo.
    public Object mostrarUltimoElemento_Top(){
        return ultimovaloringresado.elemento;
    }
    //tamaño de la lista
    public int tamañoPila(){
        return tamaño;
    }
    //metodo para vaciar la pila
    public void vaciarPila(){
        while(!PilaVacia()){
            eliminarNodo_Pop();
    }
        
}
    //metodo para mostrar los valores
    public void MostrarValores(){
        nodo recorrido= ultimovaloringresado;
        while(recorrido!=null){
            lista +=recorrido.elemento +"\n";
            recorrido=recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, lista);
        lista="";
    }
}
luego en la clase ejercicio2 se ejecuta todo el codigo



en el ejercicio tres creo una clase Dnodo para especificar los nodos y los atributos
En el deque se clase una interface con los metodos
public interface Deque {
    
    public void insertarPrimero(Object elemento);
    public void insertarUltimo(Object elemento);
    public void removerPrimero();
    public void removerUltimo();
    public int tamaño();
   
}

en la clase dldeque se implementan los metodos de la interface con una lista doblemente enlazada
ublic class DLdeque implements Deque{
    static Logger log = Logger.getLogger(ListaDeReproduccion.class.getName());

    public int contador;
   DNodo cabeza;
   DNodo cola;
   String organizar;

    public DLdeque() {
        cabeza=null;
        cola=null;
        contador=0;
   
    }
   

    @Override
    public void insertarPrimero(Object elemento) {
        if(cabeza==null){
            cabeza= new DNodo();
            cabeza.elemento=elemento;
            cola=cabeza;
            
        }else{
            DNodo nuevo= new DNodo();
            nuevo.elemento=elemento;
            nuevo.siguiente=cabeza;
            cabeza.anterior=nuevo;
            cabeza=nuevo;
        }
        contador++;
    }

    @Override
    public void insertarUltimo(Object elemento) {
         if(cola==null){
            cola= new DNodo();
            cola.elemento=elemento;
            cabeza=cola;
            
        }else{
            DNodo nuevo= new DNodo();
            nuevo.elemento=elemento;
            nuevo.anterior=cola;
            cola.siguiente=nuevo;
            cola=nuevo;
        }
        contador++;
    }
    

    @Override
    public void removerPrimero() {
        cabeza=cabeza.siguiente;
        cabeza.anterior=null;
    }

    @Override
    public void removerUltimo() {
        cola=cola.anterior;
        cola.siguiente=null;
        
    }

    @Override
    public int tamaño() {
        return contador;
    }

   public String toString(){
     String s="cabeza[";
     for(DNodo p= cabeza;p!=null;p=p.siguiente){
         s+=p.elemento+"-";
     }
       return s+"]cola";
   }
    
}
y la clase Principal se implementa y ejecuta todo
