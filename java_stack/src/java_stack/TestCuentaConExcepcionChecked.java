package java_stack;

public class TestCuentaConExcepcionChecked {

	 public static void main(String[] args) {

         Cuenta c = new Cuenta();
         try {
             c.deposita();
         } catch(MiException ex) {
             System.out.println("tratamiento ....");
         }

     }
}
