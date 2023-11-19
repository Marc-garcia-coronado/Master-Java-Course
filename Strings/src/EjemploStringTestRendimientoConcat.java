public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
//            c = c.concat(b).concat("\n"); // 500 => 1ms, 1000 => 3ms
//            c += a + b + "\n"; // 500 => 11ms, 1000 => 12ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 1ms
        }


        long fin = System.currentTimeMillis();
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.out.println(fin - inicio + "ms");





    }
}
