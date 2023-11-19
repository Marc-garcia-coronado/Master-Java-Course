public class ConversionDeTipos {
    public static void main(String[] args) {

        String numberStr = "50";
        int numberInt = Integer.parseInt(numberStr);
        System.out.println("numeroInt = " + numberInt);

        String realStr = "98234.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoString = "true";
        boolean logicBoolean = Boolean.parseBoolean(logicoString);
        System.out.println("logicBoolean = " + logicBoolean);

        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);


    }
}
