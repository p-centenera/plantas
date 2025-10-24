public class Principal {
    public static void main(String [] args){
        Planta p=new Planta("azalea",25);
        //p.setNombre("geranio");
        //p.setAltura(15);
        System.out.println(p.getNombre());
        System.out.println(p.getAltura());
        System.out.print(p);
    }
}
