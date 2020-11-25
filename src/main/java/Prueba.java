public class Prueba {
    //58748 58780 58770 58752 58807 51695
    public int probar(String poox){
    int numero = Character.getNumericValue(poox.charAt(0))+ Character.getNumericValue(poox.charAt(1))+ Character.getNumericValue(poox.charAt(2))+ 
            Character.getNumericValue(poox.charAt(3))+ Character.getNumericValue(poox.charAt(4));
    int comprobar;
    if(numero >= 30){
        comprobar = 2;
        System.out.println( numero +" Digito verificar = " + comprobar);
    }else if (numero >=20 && numero <= 29){
        comprobar = 1;
        System.out.println(numero + " Digito verificar = " + comprobar);
    }else{
        comprobar = 0;
        System.out.println(numero + " Digito verificar = " + comprobar);
    }
    return comprobar;
    }
    public static void main(String[] args) {
       Prueba x = new Prueba();
        System.out.print("La matricula 58748, la suma es 5+8+7+4+8 hashsimple = ");
        System.out.println( x.probar("58748"));
        System.out.print("La matricula 58780, la suma es 5+8+7+8+0 hashsimple = ");
        System.out.println( x.probar("58780"));
        System.out.print("La matricula 58770, la suma es 5+8+7+7+0 hashsimple = " );
        System.out.println(x.probar("58770"));
        System.out.print("La matricula 58752, la suma es 5+8+7+5+2 hashsimple = " );
        System.out.println(x.probar("58752"));
        System.out.print("La matricula 58807, la suma es 5+8+8+0+7 hashsimple = " );
        System.out.println(x.probar("58807"));
        System.out.print("La matricula 51695, la suma es 5+1+6+9+5 hashsimple = ");
        System.out.println(x.probar("51695")); 
    }
}
