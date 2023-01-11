package CajaFuerteProyect;

public class CajaFuerte {
    //ESTADO,ATRIBUTOS
    //Mientras esté funcionando, tiene que recordar la key

    private String pass = "0000";
    private String oldPass;
    private String newPass;

    //CONSTRUCTOR
    public CajaFuerte(String passInicial) {
        this.pass = passInicial;
    }

    //COMPORTAMIENTOS
    public boolean changePass(String oldPass, String newPass) {
         if (oldPass.equals(pass)) {
            pass = newPass;
            return true;
        } else {
            return false;
        }
    }

    //Métodos
    /* ChangePassword. Me dan la antigua, la comparo, y si va bien la cambio
    por la nueva */
    //Estructura:
    //public tipodevueltoenelreturn nombreMetodo(tipoParametro1 par1, tipoParametro2 par2...
    //...código ...
    //}


    //Metodo open
    public boolean open(String clave) {
        if (clave.equals(pass)) {
            return true;
        } else {
            return false;
        }
    }

}
