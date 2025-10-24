public class Planta {
    private String nombre;
    private int altura;
    public String toString(){
        return "nombre: "+nombre+", altura: "+altura;
    }
    public String getNombre(){
        return nombre;
    }
    public int getAltura(){
        return altura;
    }
    public void setNombre(String nombre_){
        nombre=nombre_;
    }
    public void setAltura(int altura_){
        altura=altura_;
    }
    public Planta(String nombre_,int altura_){
        nombre=nombre_;
        altura=altura_;
    }
}
