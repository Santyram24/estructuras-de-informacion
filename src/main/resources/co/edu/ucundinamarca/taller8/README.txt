public class NodoArbol {//clase para los nodos
        

    int numero;//atributo para insertar el numero
    NodoArbol hijoDerecho;//atributos de tipo NodoArbol para los hijos de cada
//raiz
    NodoArbol hijoIzquierdo;

    public NodoArbol(int numero) {//constructor que dijita el valor en el parame
tro y los hijos como null
       this.numero=numero;
      this.hijoDerecho=null;
      this.hijoIzquierdo=null;
    } 

public class ArbolBinario {

static Logger log = Logger.getLogger(Principal.class.getName());//invocar
//el metodo logger para usar el log.info
   
    int altura=0;//se utiliza para determinar el numero de niveles del arbol

    public int getAltura() {//metodo para obtener la altura
        return altura;
    }
    

    public ArbolBinario() {//constructor donde definimos que la raiz sea nula
    raiz=null;
    }
    
    //metodo para insertar un nodo en el arbol
    public void agregarNodo(int dato){
     NodoArbol nuevo= new NodoArbol(dato);
     if(raiz==null){//si la raiz es nula entonces la raiz es igual al nuevo
         raiz=nuevo;
        
     }else{//si no entonces se hara un pequeño bucle en cual se va a ir cambiando
de nodo padre y de ahi se insertan sus hijos
         NodoArbol actual=raiz;
         NodoArbol nodoPadre;
         while (true) {             
             nodoPadre=actual;
             if(dato<actual.numero){
                 actual=actual.hijoIzquierdo;
                 if(actual==null){
                     nodoPadre.hijoIzquierdo=nuevo;
                     
                     return;
                 }
             }else {
                 actual=actual.hijoDerecho;
                 if(actual==null){
                     nodoPadre.hijoDerecho=nuevo;
                     altura++;//solo se utilizara una vez este atributo ya que 
//si se mantiene en el otro izquierdo va a aumentar exponencialmente
                     return;
                 }
             }
         }
     }
    }
    //metodo para saber si el arbol esta vacio
        public boolean ArbolVacio(){
            return raiz==null;
        }
    //metodo para imprimir Inorden
        public void InOrden(NodoArbol raiz){
            if(raiz!=null){//si la raiz es distinta de nulo
                InOrden(raiz.hijoIzquierdo);//se hara el metodo recursivo primero 
con los del lado izquierdo
                //System.out.println(raiz.numero);
                JOptionPane.showMessageDialog(null, raiz.numero);
                InOrden(raiz.hijoDerecho);
                 //y luego con los del lado derecho
            }
        }
        //metodo para imprimir el arbol en preorden
        public void PreOrden(NodoArbol raiz){
            if(raiz!=null){//si raiz diferente de nulo
//entonces primero se imprime la raiz y luego se hace lo respectivo con los 
metodos recursivos para imprimirlos en orden de inserción

                JOptionPane.showMessageDialog(null, raiz.numero);
                PreOrden(raiz.hijoIzquierdo);
                PreOrden(raiz.hijoDerecho);
            }
        }
        //metodo para imprimir el arbol postorden
        public void PostOrden(NodoArbol raiz){
            if(raiz!=null){//si la raiz es diferente de nulo
//entonces se hace primero los metodos recursivos y luego finalmente se imprime 
//la raiz
                PostOrden(raiz.hijoIzquierdo);
                PostOrden(raiz.hijoDerecho);
                JOptionPane.showMessageDialog(null, raiz.numero);
            }
        
}

//clase para hacer todo la implementacion de los metodos
public class Principal {
static Logger log = Logger.getLogger(Principal.class.getName());
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int opcion,elemento;
        ArbolBinario arbol= new ArbolBinario();
        do{
            log.info("Digite la opcion\n1.digite el nodo en"
                    + " el arbol\n2.mostrar en preorden"
                    + "\n3.mostrar en postorden"
                    + "\n4.mostrar en inorden"
                    + "\n5.mostrar los niveles"
                    + "\n6.salir");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    log.info("Digite el numero a dejar en el arbol");
                    elemento=leer.nextInt();
                    arbol.agregarNodo(elemento);
                case 2:
                    if(!arbol.ArbolVacio()){
                        arbol.PreOrden(arbol.raiz);
                    }else{
                        log.info("El arbol esta vacio");
                    }
                    break;
                case 3:
                     if(!arbol.ArbolVacio()){
                        arbol.PostOrden(arbol.raiz);
                    }else{
                        log.info("El arbol esta vacio");
                    }
                    break;
                case 4:
                    if(!arbol.ArbolVacio()){
                        arbol.InOrden(arbol.raiz);
                    }else{
                        log.info("El arbol esta vacio");
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"su altura es:1"+ arbol.getAltura());
                    break;
                case 6:
                    break;
                    default:
                        log.info("ERROR");
                        break;
                           
            }
        }while(opcion!=6);
        log.info("Fin del programa");
        
    }
}