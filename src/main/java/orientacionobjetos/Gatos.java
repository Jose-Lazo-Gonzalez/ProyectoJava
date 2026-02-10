package orientacionobjetos;

public class Gatos {
    //Atributos
    public String color;
    public String raza;
    private String sexo;
    int edad;
    int peso;




    //metodos
    void maulla(){
        System.out.println("miauuuuuuuu");
    }
    void ronronea(){
        System.out.println("rrrrrr");
    }
    void come (String comida){
        if(comida.equals("pescado")){
            System.out.println("yummi yummi");
        }
        else {
            System.out.println("buahh, mejor no");
        }
    }






}
